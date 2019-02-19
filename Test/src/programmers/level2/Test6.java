package programmers.level2;



public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 test6 = new Test6();
		String s = "3people unFollowed me";
		test6.solution(s);
	}
	public String solution(String s) {
	    String answer = "";
	    String[] sList = s.split(" ");
	    for(int i=0;i<sList.length;i++) {
	    	sList[i].substring(0, 1);
	    }
	    return answer;
	}

}
