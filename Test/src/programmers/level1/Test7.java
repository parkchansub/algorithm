package programmers.level1;
import java.util.Arrays;
// 프로그래머스  문자열 내림 차순으로 배치하기(완료) / 블로그(완료)
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 test7 = new Test7();
		String b = test7.solution("Zbcdefg");
		System.out.println(b);
	}
	
	public String solution(String a){
		String answer = "";
		
		// String값을 1개씩 char형태로 변환 하여 배열 담기
		char[] ch = a.toCharArray();
		
		//아스키 코드로 저장후 sort하기 위한 배열
		int[] intchList= new int[ch.length];
		
		for(int i=0;i<ch.length;i++){
			int intch = ch[i];
			intchList[i] = intch;
		}
		
		Arrays.sort(intchList);
		
		//아스키 코드 값의 역순으로 나오길 원하기 때문에  i의 시작값을 intchList.length-1 로 설정하고 i--을 해줌
		for(int i=intchList.length-1;i>-1;i--){
		answer = answer+String.valueOf((char)intchList[i]);
		}
		
		return answer;
	}
}
