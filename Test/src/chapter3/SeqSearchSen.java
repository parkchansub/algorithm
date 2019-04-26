package chapter3;

import java.util.Scanner;
//선형 검색 - 2
public class SeqSearchSen {
	
	static int seqSearchSen(int[] x,int key, int num){
		int i = 0;
		
		x[num] = key;
		while(true){
			if(x[i]==key)
				break;
			i++;
		}
		return i== num ? -1:i;
	}
	
	
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		
		for(int i=0; i<num; i++){
			System.out.println("x[" +i+ "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("찾는 숫자는");
		int key = stdIn.nextInt();
		int idx = seqSearchSen(x,key, num);
		
		if(idx == -1)
			System.out.println("없는 값입니다.");	
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
	}
}
