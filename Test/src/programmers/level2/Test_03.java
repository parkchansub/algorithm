package programmers.level2;

import java.util.Arrays;

//프로그래머스 - 카펫(완료) / 블로그 (완료)

	/*
	Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고 모서리는 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
	
	Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
	
	Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
	빨간색 격자의 수 red는 1 이상 2,000,000 이하인 자연수입니다.
	카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
	입출력 예
	brown	red	 return
	 10		 2	 [4, 3]
	 8		 1	 [3, 3]
	 24		 24	 [8, 6]
	 */
public class Test_03 {

	public static void main(String[] args) {
		
		Test_03 test3 = new Test_03();
		/*System.out.println(Arrays.toString(test3.solution(10, 2)));*/
		System.out.println(Arrays.toString(test3.solution(12, 4)));
		/*System.out.println(Arrays.toString(test3.solution(24, 24)));*/
		

	}
	
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        
        if(red<3){
        	for(int i=1;i<=red;i++){
            	int b =red/i;
            	int check = (b*2) +(i*2)+4;
            	int sum = (b+2)*(i+2);
            	if(brown == check && sum == red+brown){
            		answer[0] = b+2;
            		answer[1] = i+2;
            		return answer;
            	}
            }
        }
        for(int i=1;i<=(red/2);i++){
        	int b =red/i;
        	int check = (b*2) +(i*2)+4;
        	int sum = (b+2)*(i+2);
        	if(brown == check && sum == red+brown){
        		answer[0] = b+2;
        		answer[1] = i+2;
        		return answer;
        	}
        }
        return answer;
    }

}
