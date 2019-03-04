package programmers.level2;

import java.util.Arrays;

// 프로그래머스  - 최댓값과 최소값(완료) / 블로그 작성(완료)

	/*
	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
	예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.
	
	제한 조건
	s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
	입출력 예
	s				return
	1 2 3 4			  1 4
	-1 -2 -3 -4		 -4 -1
	-1 -1			 -1 -1
	*/
public class Test_04 {

	public static void main(String[] args) {
		String a = "1 2 3 4";
		String b = "-1 -2 -3 -4"; 
		
		Test_04 test4 = new Test_04();
		String c= test4.solution(b);
		System.out.println(c);
	}
	
	public String solution(String s) {
	      String answer = "";
	      String[] data = s.split(" ");
	      int[] intdata = new int[data.length];
	      for(int i=0;i<data.length;i++){
	    	  intdata[i]=Integer.parseInt(data[i]);
	      }
	      Arrays.sort(intdata);
	      answer = String.valueOf(intdata[0]+" "+intdata[intdata.length-1]);
	      return answer;
	}
	
}
