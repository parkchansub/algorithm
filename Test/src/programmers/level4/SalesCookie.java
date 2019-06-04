package programmers.level4;
//프로그래머스 - 쿠키 구입
	/*
	 
	문제 설명
	과자를 바구니 단위로 파는 가게가 있습니다. 이 가게는 1번부터 N번까지 차례로 번호가 붙은 바구니 N개가 일렬로 나열해 놨습니다.
	철수는 두 아들에게 줄 과자를 사려합니다. 첫째 아들에게는 l번 바구니부터 m번 바구니까지, 둘째 아들에게는 m+1번 바구니부터 r번 바구니까지를 주려합니다. 
	단, 두 아들이 받을 과자 수는 같아야 합니다(1 <= l <= m, m+1 <= r <= N). 즉, A[i] 를 i번 바구니에 들어있는 과자 수라고 했을 때, A[l]+..+A[m] = A[m+1]+..+A[r] 를 만족해야 합니다.
	각 바구니 안에 들은 과자 수가 차례로 들은 배열 cookie가 주어질 때, 조건에 맞게 과자를 살 경우 한 명의 아들에게 줄 수 있는 가장 많은 과자 수를 return 하는 solution 함수를 완성해주세요.
	(단, 조건에 맞게 과자를 구매할 수 없다면 0을 return 합니다)
	
	제한사항
	cookie의 길이는 1 이상 2,000 이하입니다.
	cookie의 각각의 원소는 1 이상 500 이하인 자연수입니다.
	
	입출력 예
	cookie		result
	[1,1,2,3]	  3
	[1,2,4,5]	  0
	
	입출력 예 설명

	입출력 예 #1
	첫째 아들에게 2, 3번 바구니를, 둘째 아들에게 4번 바구니를 사주면 두 아들은 각각 과자 3개를 받습니다.
	
	입출력 예 #2
	주어진 조건에 맞게 과자를 살 방법이 없습니다.
	
	*/
public class SalesCookie {

	public static void main(String[] args) {
		int[] cookie = new int[]{1,1,2,3};
		SalesCookie test4_sales_cookie = new SalesCookie();
		System.out.println(test4_sales_cookie.solution(cookie));
	}
	
    public int solution(int[] cookie) {
        int answer = -1;
        int mid = 0;
        int firstSun = 0;
        int secondSun = 0;
        int end = cookie.length-1;
        while(firstSun==secondSun||secondSun !=0){
        	firstSun = 0;
        	secondSun = 0;
        	for(int i = 0 ; i<=end ; i++){
        		if(mid>=i){
        			firstSun = firstSun + cookie[i];
        		}
        		else{
        			secondSun = secondSun + cookie[i];
        		}
        	}
        	if(firstSun>secondSun){
        		System.out.println("firstSun:"+firstSun);
        		System.out.println("secondSun:"+secondSun);
        		System.out.println("mid++");
        		mid++;
        	}
        	if(firstSun<secondSun){
        		System.out.println("firstSun:"+firstSun);
        		System.out.println("secondSun:"+secondSun);
        		System.out.println("end--");
        		end--;
        	}
        	if(mid==end){
        		return 0;
        	}
        	if(firstSun==secondSun){
        		System.out.println(secondSun);
        		return firstSun;
        	}
        }
        
        return answer;
    }
    // 타블로그 참고
    public int solution2(int[] cookie) {
        int answer = -1;
        int max = 0;

        if(cookie.length < 2) return 0;
        if(cookie.length == 2) {
            if(cookie[0] == cookie[1]) return cookie[0];
            else return 0;
        }

        for(int i = 0; i < cookie.length - 1; i++) {

            int frontSum = cookie[i];
            int indexOfFrontSum = i;

            int backSum = cookie[i+1];
            int indexOfBackSum = i+1;

            while(true) {

                if(frontSum == backSum) max = Math.max(frontSum, max);

                if(indexOfFrontSum > 0 && frontSum <= backSum) {
                    indexOfFrontSum--;
                    frontSum += cookie[indexOfFrontSum];
                }

                else if(indexOfBackSum < cookie.length - 1 && frontSum >= backSum) {
                    indexOfBackSum++;
                    backSum += cookie[indexOfBackSum];
                }

                else break;
            }

        }

        answer = max;
        return answer;
    }
}
