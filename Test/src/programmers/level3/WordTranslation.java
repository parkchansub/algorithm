package programmers.level3;

import java.util.ArrayList;
import java.util.List;
//프로그래머스 - 단어 변환(완료) / 블로그(완료)

/*
	문제 설명
	
	두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.
	
	1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
	2. words에 있는 단어로만 변환할 수 있습니다.
	예를 들어 begin이 hit, target가 cog, words가 [hot,dot,dog,lot,log,cog]라면 hit -> hot -> dot -> dog -> cog와 같이 4단계를 거쳐 변환할 수 있습니다.
	
	두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	
	각 단어는 알파벳 소문자로만 이루어져 있습니다.
	각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
	words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
	begin과 target은 같지 않습니다.
	변환할 수 없는 경우에는 0를 return 합니다.
	
	입출력 예
	
	begin	target				words				return
	 hit	 cog	[hot, dot, dog, lot, log, cog]	  4
	 hit	 cog	[hot, dot, dog, lot, log]		  0
	
	입출력 예 설명
	
	예제 #1
	문제에 나온 예와 같습니다.
	
	예제 #2
	target인 cog는 words 안에 없기 때문에 변환할 수 없습니다.
	*/

public class WordTranslation {

	public static void main(String[] args) {
		WordTranslation wordTranslation = new WordTranslation();
		String begin = "hit";
		String target = "cog";
		String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
		
		System.out.println(wordTranslation.solution(begin, target, words));
	}
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        List<String> wordList = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
        	wordList.add(words[i]);
        }
        
        answer = recosion(begin,target,wordList,0);
        return answer;
    }
	public int recosion(String begin, String target, List<String> wordList, int stack){
		char[] beginList = begin.toCharArray();
		char[] targetList = target.toCharArray();
		int cheack = beginList.length-1;
		for(int i=0;i<wordList.size();i++){
			int count= 0;
			int targetcount = 0;
			char[] compare = wordList.get(i).toCharArray();
			for(int j=0;j<beginList.length;j++){
				if(beginList[j]==compare[j]){
					count++;
				}
				if(beginList[j]==targetList[j]){
					targetcount++;
				}
			}
			if(targetcount==cheack){
				stack++;
				return stack;
			}
			
			if(count==cheack){
				begin = wordList.get(i);
				stack++;
				wordList.remove(i);
				return recosion(begin, target, wordList, stack);
			}
		}
		return 0;
	}

}
