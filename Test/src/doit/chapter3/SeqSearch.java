package doit.chapter3;

import java.util.Scanner;
// 선형 검색
public class SeqSearch {
	
	
	//while 문 
	static int seqSearch(int[] a, int n, int key){
		int i = 0;
		
		while(true){
			if(i == n)
				return -1;
			
			if(a[i] == key)
				return i;
			i++;
		}
	}
	
	//while 문 => for 문으로 변경(프로그램은 보다 짧고 간결해 짐) 
	static int seqSearchFor(int[] a, int n, int key){
		for(int i=0;i<n;i++){
			if (a[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0 ; i<num ; i++){
			System.out.println("x[" +i+ "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값 :");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1)
			System.out.println("그  값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
}
