import java.util.HashMap;
import java.util.Map;

// 시저 암호(완주 못한 선수)
public class Test3 {
    
    public static void main(String args[])  {
    	String[] a= new String[] {"leo", "kiki", "eden", "kiki","kiki"};
    	String[] b= new String[] {"eden", "kiki","leo", "kiki"};
    	String[] as  = new String[] {"leo", "kiki", "eden"};
    	String[] bs  = new String[] {"eden", "kiki"};
    	String[] asd = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
    	String[] bsd = new String[] {"josipa", "filipa", "marina", "nikola"};
    	
    	Test3 test1 = new Test3();
    	Test3 test2 = new Test3();
    	Test3 test3 = new Test3();
    	
    	/*String d= test1.solution2(a, b);
    	System.out.println(d);*/
    	String d1 = test2.solution2(as, bs);
    	System.out.println(d1);
    	/*String d2 = test3.solution2(asd, bsd);
    	System.out.println(d2);*/
    }
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
        	
        	for(int j=0;j<completion.length;j++){
        		if(map.containsKey(completion[j])){
        			int num = (int) map.get(completion[j])-1;
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
                }
            }
            
            return answer;
        }
}

