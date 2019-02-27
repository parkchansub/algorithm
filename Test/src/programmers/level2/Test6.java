package programmers.level2;

// 프로그래머스 - JadenCase 문자열 만들기


	/*
	JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
	문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	제한 조건
	
	s는 길이 1 이상인 문자열입니다.
	s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
	첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
	
	입출력 예
			s						return
	3people unFollowed me	3people Unfollowed Me
	for the last week		For The Last Week
	
	*/
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
	    String[] answerList = new String[sList.length];
	    
	    
	    for(int i=0;i<sList.length;i++) {
	    	char[] ch = sList[i].toCharArray();
	    	int intc = ch[0];
	    	answerList[i] ="";
	    	if(intc>=97 && intc<=122){
	    		intc = intc-32;
	    		ch[0] = (char) intc;
	    	}
	    	for(int j=0;j<ch.length;j++){
    			answerList[i] =	answerList[i] + ch[j];
    		}
	    }
	    
	    for(int i=0;i<answerList.length;i++){
	    	if(i==answerList.length-1){
	    		answer = answer +answerList[i];
	    	}else{
	    		answer = answer +answerList[i]+" ";
	    	}
	    	
	    }
	    return answer;
	}

}
