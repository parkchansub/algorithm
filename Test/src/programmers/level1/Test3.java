package programmers.level1;
import java.util.HashMap;
import java.util.Map;

// 프로그래머스 - 완주 못한 선수(완료) / 블로그 작성(완료)
public class Test3 {
    
    public static void main(String args[])  {
    	String[] a= new String[] {"leo", "kiki", "eden", "kiki","kiki"};
    	String[] b= new String[] {"eden", "kiki","leo", "kiki"};
    	String[] as  = new String[] {"leo", "kiki", "eden"};
    	String[] bs  = new String[] {"eden", "kiki"};
    	String[] asd = new String[] {"mislav", "stanko", "ana", "ana", "mislav"};
    	String[] bsd = new String[] {"stanko", "ana", "mislav", "mislav"};
    	Test3 test1 = new Test3();
    	
    	String d1 = test1.solution2(asd, bsd);
    	System.out.println(d1);
    }
    
    // 첫번쨰 풀이
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0;i<completion.length;i++){
            for(int j=0;j<participant.length;j++){
                if(completion[i].equals(participant[j])){
                    participant[j] = "flase";
                    break;
                }
            }
        }
        
        for(int k=0;participant.length>k;k++){
            if(participant[k]!="flase"){
            	answer = participant[k];
            	break;
            }
        }
        
        return answer;
    }
    
    // 두번쨰 풀이    	
    public String solution2(String[] participant, String[] completion) {
    		String answer = "";
    		
    		Map map = new HashMap();
        	for(int i=0;i<participant.length;i++){
        		int n = 1;
        		if(map.containsKey(participant[i])){
        			int num = (int) map.get(participant[i])+1;
        			map.put(participant[i], num);
        		}
        		else{
        			map.put(participant[i], n);
        		}
        		
        	}
        	String[] bsd = new String[] {"stanko", "ana", "mislav", "mislav"};
        	for(int j=0;j<completion.length;j++){
        		if(map.containsKey(completion[j])){
        			int num = (int) map.get(completion[j])-1;
        			map.put(completion[j], num);
        			if(num==0){
        				map.remove(completion[j]);
        			}
        			
        		}
        	}
        	
        	for(int m=0;m<participant.length;m++){
        		if(map.containsKey(participant[m])){
        			answer  = participant[m];
        		}
        	}
    		return answer;
    	}
	}


