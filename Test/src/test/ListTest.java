package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
	
	

	public static void main(String[] args) {
		int number = 10;
		List<Integer> numberList = new ArrayList<>();
		numberList.add(number);
		ListTest listTest = new ListTest(numberList);

	}
	private final List<Integer> numbers;
	
	public ListTest(List<Integer> numbers){
		Collections.sort(numbers);
		
		this.numbers = numbers;
	}

}
