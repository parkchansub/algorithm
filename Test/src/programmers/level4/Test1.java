package programmers.level4;

import java.util.LinkedList;

// 프로그래머스 - 카드게임(진행중)

	/*
	
	카드게임이 있다. 게임에 사용하는 각 카드에는 양의 정수 하나가 적혀있고 같은 숫자가 적힌 카드는 여러 장 있을 수 있다. 
	게임방법은 우선 짝수개의 카드를 무작위로 섞은 뒤 같은 개수의 두 더미로 나누어 하나는 왼쪽에 다른 하나는 오른쪽에 둔다.
	각 더미의 제일 위에 있는 카드끼리 서로 비교하며 게임을 한다. 게임 규칙은 다음과 같다. 
	지금부터 왼쪽 더미의 제일 위 카드를 왼쪽 카드로, 오른쪽 더미의 제일 위 카드를 오른쪽 카드로 부르겠다.
	
	1. 언제든지 왼쪽 카드만 통에 버릴 수도 있고 왼쪽 카드와 오른쪽 카드를 둘 다 통에 버릴 수도 있다. 이때 얻는 점수는 없다.
	2. 오른쪽 카드에 적힌 수가 왼쪽 카드에 적힌 수보다 작은 경우에는 오른쪽 카드만 통에 버릴 수도 있다. 오른쪽 카드만 버리는 경우에는 오른쪽 카드에 적힌 수만큼 점수를 얻는다.
	3. (1)과 (2)의 규칙에 따라 게임을 진행하다가 어느 쪽 더미든 남은 카드가 없다면 게임이 끝나며 그때까지 얻은 점수의 합이 최종 점수가 된다.
	
	왼쪽 더미의 카드에 적힌 정수가 담긴 배열 left와 오른쪽 더미의 카드에 적힌 정수가 담긴 배열 right가 매개변수로 주어질 때, 
	얻을 수 있는 최종 점수의 최대값을 return 하도록 solution 함수를 작성하시오.
	
	제한 사항
	
	한 더미에는 1장 이상 2,000장 이하의 카드가 있다.
	각 카드에 적힌 정수는 1 이상 2,000 이하이다.
	
	입출력 예
	
		  left	      right	    return
		[3, 2, 5]	[2, 4, 1]	  7

	입출력 예 설명
	
	먼저 오른쪽 카드를 버려서 2점을 획득한다.
	그 뒤 왼쪽 카드를 두 장 버리고 오른쪽 카드를 버려서 4점을 획득한다.
	마지막으로 오른쪽 카드를 버려서 1점을 획득한다.
	총 얻을 수 있는 점수는 7점이다.
 	*/

public class Test1 {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		int[] left = new int[]{3, 2, 5};
		int[] right = new int[]{2, 4, 1};
		int a = test1.solution(left, right);
		System.out.println(a);
	}

	
	public int solution(int[] left, int[] right){
		int answer = 0;
		LinkedList<Integer> leftList = new LinkedList<Integer>();
		LinkedList<Integer> rightList = new LinkedList<Integer>();
		
		for(int i=0;i<left.length;i++){
			leftList.add(left[i]);
			rightList.add(right[i]);
		}
		
		while(leftList.isEmpty() && rightList.isEmpty()){
			leftList.getFirst(); 
		}
		return answer;
	}
	
/*	public int solution(int[] left, int[] right) {
	    int answer = 0;
	    
	    answer = recosion(left, right, 0, 0, 0);
	    return answer;
	     
	}
	public int recosion(int[] left, int[] right, int sum, int i, int j){
		
		if(j<right.length && left[i]>right[j]){
			sum = sum + right[j];
		}
		if(i==left.length-1 && j==right.length-1){
			return sum;
		}
		
		if(left[i]<=right[j] && i<left.length){
			i++;
			return recosion(left,right, sum, i, j);
		}
		
		return recosion(left,right, sum, i, j+1);
	}*/
	    
	    
}
