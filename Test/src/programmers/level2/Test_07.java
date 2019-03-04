package programmers.level2;
import java.util.Arrays;
//프로그래머스 - 탑(완료) / 블로그 (완료)
public class Test_07 {

	public static void main(String[] args) {
		
		Test_07 test7 = new Test_07();
		int[] heights = new int[]{6,9,5,7,4};
		int[] answer = test7.solution(heights);  
		
		System.out.println(Arrays.toString(answer));
	}
	public int[] solution(int[] heights){
	    int[] answer = new int[heights.length];
	    int count = heights.length;
	    for(int i=count-1;i>-1;i--){
	    	for(int j =i-1;j>-1;j--){
	    		if(heights[j]>heights[i]){
	    			answer[i] = j+1;
	    			System.out.println(Arrays.toString(answer));
	    			break;
	    			
	    		}
	    	}
	    }
        return answer;
	}
}
