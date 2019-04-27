package test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 test5 = new Test5();
		System.out.println(test5.solution(33));
	}
		public int solution(int number) {
	        int answer = 0;
	        
	        for(int i=1;i<number+1;i++){
	        	String sNumber = String.valueOf(i);
	        	for (int j = 0; j < sNumber.length(); j++) {
	        	char cNumber = sNumber.charAt(j);
	        	if(cNumber=='3'||cNumber=='6'||cNumber=='9') {
	        		answer++;
	        	}
	        }
		}
	    return answer;
	}
}



