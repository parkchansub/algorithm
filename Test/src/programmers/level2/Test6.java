package programmers.level2;



public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 test6 = new Test6();
		String s = "3people unFollowed me";
		String b= test6.solution(s);
		System.out.println(b);
	}
	public String solution(String s) {
	    String answer = "";
	    String[] sList = s.split(" ");
	    System.out.println("123");
	    for(int i=0;i<sList.length;i++) {
	    	char c = sList[i].charAt(0);
	    	sList[i].toCharArray();
	    	int intc = c;
	    	System.out.println("456");
	    	if(intc>=97 && intc<=122){
	    		System.out.println("789");
	    		intc = intc-32;
	    		
	    	}
	    }
	    
	    for(int i=0;i<sList.length;i++){
	    	System.out.println("23233");
	    	answer = answer +sList[i]+" ";
	    }
	    return answer;
	}

}
