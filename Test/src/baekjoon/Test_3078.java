package baekjoon;

import java.util.LinkedList;

/*
	상근이는 환갑을 바라보던 나이에 수능 시험을 다시보고 교대에 입학했고, 초등학교 선생님으로 취직했다.
	
	상근: 요즘 애들은 친구를 사귀지 않나봐. 내가 앞에서 보고 있으면, 친구가 있는 학생이 별로 없는 것 같아.
	??: 오빠! 오빠는 말콤의 친구와 성적이라는 책 안 읽어 봤어? 이 책에는 성적과 친구가 무슨 관계가 있는지 나와. 
		요즘 애들은 친구를 사귀기 전에 먼저 그 친구의 반 등수를 살펴봐. 말콤은 이 연구를 하기 위해서 6년동안 초등학교에서 선생님으로 위장 했었지. 
		하지만, 6년이라는 시간을 초등학교에서 보냈지만, 그 사람은 결국 결론을 얻지 못했어.
	상근: 근데?
	??: 내 말 아직 안끝났어. 말콤이 어느날 자신이 초등학생이 되어 학교를 활보하는 꿈을 꾸었어. 
		근데 잠을 깨고 나니 내가 꿈을 꾸고 초등학생이 된건지, 아니면 초등학생이 꿈을 꾸고 지금의 내가 되어있는지를 모르겠는거야.
		그래서 말콤은 상식적인 사고 방식에 큰 의문을 가졌지. 그 때 말콤은 깨달았던거야. 초등학교 친구는 부질없구나. 
		그제서야 알게된거야. 모든 학생은 자신과 반 등수의 차이가 K를 넘으면 친구가 아니라는거.
	상근: 아? 근데 K는 어떻게 구해?
	??: K는 문제에서 주어지지. 근데, 더 중요한 사실이 있어. 친구와 좋은 친구의 차이야.
	 	말콤이 친구와 성적을 쓰고 2년 뒤에 낸 책인 좋은 친구라는 책에는 좋은 친구는 이름의 길이가 같아야 된다는 말이 나와.
	상근: 아! 그럼 난 오늘 집에 가서 우리 반에 좋은 친구가 몇 쌍이나 있는지 구해봐야 겠어!
	
	상근이네 반의 N명 학생들의 이름이 성적순으로 주어졌을 때, 좋은 친구가 몇 쌍이나 있는지 구하는 프로그램을 작성하시오. 좋은 친구는 등수의 차이가 K보다 작거나 같으면서 이름의 길이가 같은 친구이다.
	
	입력
	첫째 줄에 N과 K가 주어진다. (3 ≤ N ≤ 300,000, 1 ≤ K ≤ N) 다음 N개 줄에는 상근이네 반 학생의 이름이 성적순으로 주어진다. 이름은 알파벳 대문자로 이루어져 있고, 2글자 ~ 20글자이다.
	
	출력
	첫째 줄에 좋은 친구가 몇 쌍이 있는지 출력한다.
	
	예제 입력 1 
	
	6 3
	CYNTHIA
	LLOYD
	STEVIE
	KEVIN
	MALCOLM
	DABNEY
	
	예제 출력 1 
	
	2
	
	*/
public class Test_3078 {

	public static void main(String[] args) {
		String[] a = new String[]{"CYNTHIA", "LLOYD", "STEVIE", "KEVIN", "MALCOLM", "DABNEY"};
		int b= 3;
		Test_3078 test3078 = new Test_3078();
		System.out.println(test3078.solution(a, b));
	}
	public int solution(String[] a, int b){
		int answer = 0;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for(int k=0;k<a.length;k++){
			queue.add(a[k].length());
		}
		
		dfs(queue, b,0,0);
		
		return answer;
	}
	public int dfs(LinkedList<Integer> a, int b, int i, int j){
		int answer = 0;
		
		a.pop();
		
		return dfs(a,b,i,j);
	}
}
