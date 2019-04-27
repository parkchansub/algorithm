package test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pobi = new int[] {131, 133};
		int[] crong = new int[] {211, 212};
		Test4 test4 = new Test4();
		System.out.println(test4.solution(pobi, crong));

	}
	
	public int solution(int[] pobi, int[] crong) {
		if(pobi[0]+1!=pobi[1] || crong[0]+1!=crong[1]) {
			return -1;
		}
		
        int answer = 0;
        
        String pobiFrist = String.valueOf(pobi[0]);
        String pobiSecond = String.valueOf(pobi[1]);
        String crongFirst = String.valueOf(crong[0]);
        String crongSecond = String.valueOf(crong[0]);
        int pobiMax = check(pobiFrist);
        int crongMax = check(crongFirst); 
        
        
        
        if(pobiMax>check(pobiSecond)) {
        	pobiMax = check(pobiSecond);
        }
        if(crongMax>check(crongSecond)) {
        	crongMax = check(crongSecond);
        }
        
        if(pobiMax>crongMax) {
        	answer = 2;
        }
        if(pobiMax==crongMax) {
        	answer = 0;
        }
        if(pobiMax<crongMax) {
        	answer = 1;
        }
        return answer;
    }
	public int check(String a) {
		int sum = 0;
		int summ = 1;
		for(int i=0;i<a.length();i++) {
        	String c = a.substring(i,i+1);
        	int b = Integer.parseInt(c);
        	sum = sum + b;
        	summ = summ * b;    
        }
		if(sum<summ) {
			return summ;
		}
		return sum;
	}
}
