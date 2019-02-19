package programmers.level2;
// 프로그래머스  - 숫자의 표현(완료) / 블로그 작성(완료)

	/*
	Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
	
	1 + 2 + 3 + 4 + 5 = 15
	4 + 5 + 6 = 15
	7 + 8 = 15
	15 = 15
	자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
	
	제한사항
	n은 10,000 이하의 자연수 입니다.
	입출력 예
	n	result
	15	4
	입출력 예 설명
	입출력 예#1
	문제의 예시와 같습니다.
	*/

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test5 = new Test5();
		int a = test5.solution(15);
		System.out.println(a);
	}

	public int solution(int n) {
	    int answer = 0;
	    answer = dfc(n,1,0);
	    return answer;
	    
	}
	
	public int dfc(int n, int num, int count){
		int sum =0;
		
		if(num == n){
			++count;
			return count;
		}
		for(int i=num;sum<=n;i++){
			sum = sum+i;
			if(sum==n){
				++num;
				++count;
				return dfc(n,num, count);
			}
            else if((n/2)<num){
                num = n;
                return dfc(n,num, count);
            }
		}
		
			++num;
		return dfc(n,num, count);
	}
	
	
}
