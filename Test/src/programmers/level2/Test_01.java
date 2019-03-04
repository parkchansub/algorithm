package programmers.level2;

import java.util.HashMap;

// 프로그래머스  - 스킬 트리(진행중) / 
public class Test1 {

	public static void main(String[] args) {
		String  a ="CBD";
		String[] skill = new String[]{"BACDE","CBADF","AECB","BDA"};
		Test1 test1 = new Test1();
		int b = test1.solution(a, skill);
		System.out.println(b);
	}
	  public int solution(String skill, String[] skill_trees) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        int answer = 0;
	        
	        for(int i = 0; i < skill.length(); i++) {
	            map.put(skill.charAt(i), i + 1);
	        }
	        
	        for(int i = 0; i < skill_trees.length; i++) {
	            int[] temp = new int[skill_trees[i].length()];
	            String tmp = skill_trees[i];
	            
	            for(int j = 0; j < tmp.length(); j++) {
	                if(map.containsKey(tmp.charAt(j))) {
	                    temp[j] = map.get(tmp.charAt(j));
	                } else {
	                    temp[j] = 0;
	                }
	            }
	            int cur = 0;
	            for(int j = 0; j <= tmp.length(); j++) {
	                if(j == tmp.length()) {
	                    answer += 1;
	                    break;
	                }
	                if(temp[j] <= cur) {
	                    continue;
	                } else {
	                    if(temp[j] - 1 == cur) {
	                        cur = temp[j];
	                        if(cur == skill.length()) {
	                            answer += 1;
	                            break;
	                        } 
	                    } else {
	                        break;
	                    }
	                }
	            }
	        }
	        return answer;
	    }
	
}
