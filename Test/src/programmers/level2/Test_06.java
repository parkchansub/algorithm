package programmers.level2;

import java.util.Arrays;

// 프로그래머스 - JadenCase 문자열 만들기(런타임 에러)


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
public class Test_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_06 test6 = new Test_06();
		String s = "3people unFollowed me ASfsdf adfasdfA123 123123aASFFGGG 1  asdfasdf  ";
		String s1 = "1231444 123123";
		String s2 = " ";
		String b= test6.solution2(s);
		System.out.println(b);
	}
	public String solution(String s) {
		
	    String answer = "";
	    s = s.toLowerCase();
	    String[] sList = s.split(" ");
	    
	    String[] answerList = new String[sList.length];
	    
	    for(int i=0;i<sList.length;i++) {
	    	char[] ch = sList[i].toCharArray();
	    	int intc = ch[0];
	    	answerList[i] ="";
	    	if(intc>=97 && intc<=122){
	    		intc = intc-32;
	    		ch[0] = (char) intc;
	    		answerList[i] =	ch[0]+sList[i].substring(1, sList[i].length());
	    	}
	    	else{
	    		answerList[i] = sList[i];
	    	}
	    }
	    answer = answerList[0];
	    for(int i=1;i<answerList.length;i++){
	    		answer = answer+" "+answerList[i];
	    }
	    return answer;
	}
	
	 public String solution2(String s) {
	        s = s.toLowerCase();
	        String[] a = s.split(" ");
	        for (int i = 0; i < a.length; i++) {
	            if(a[i].length() >= 1) {
	                char[] array = a[i].toCharArray();
	                array[0] = Character.toUpperCase(array[0]);
	                a[i] = new String(array);
	            }
	        }
	        
	        String result = a[0];
	        for (int i = 1; i < a.length; i++) {
	            result += " " + a[i];
	        }
	        return result;
	    }

}
