package test;

public class Test2 {

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		String a = "ASFGGGG";
		System.out.println(test2.test(a));
		String c =a.substring(1);
		System.out.println(c);
		
		int b = 200000;
		System.out.println(b);
	}
	public String test(String a){
		String answer ="";
		a= a.toLowerCase();
		char[] b = a.toCharArray();
		b[0] = Character.toUpperCase(b[0]);
		b[1] = Character.toUpperCase(b[1]);
		a = new String(b);
		answer = a;
		return answer;
	}
}
