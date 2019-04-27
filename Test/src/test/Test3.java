package test;

import java.util.Arrays;
import java.util.Collections;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "I love you";
		Test3 test3 = new Test3();
		test3.solution(a);
	}
	public String solution(String word) {
	       String result = "";
	       String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	       String[] reAlphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	       Arrays.sort(reAlphabet, Collections.reverseOrder());
	       
	       String[] a = word.split(" ");
	       return result;
	    }
	
}
