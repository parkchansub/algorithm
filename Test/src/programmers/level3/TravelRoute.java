package programmers.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//프로그래머스 - 여행경로 
	/*
	문제 설명
	
	주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 ICN 공항에서 출발합니다.
	항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	
	모든 공항은 알파벳 대문자 3글자로 이루어집니다.
	주어진 공항 수는 3개 이상 10,000개 이하입니다.
	tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
	주어진 항공권은 모두 사용해야 합니다.
	만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
	모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.
	
	입출력 예
	
	tickets															return
	[[ICN, JFK], [HND, IAD], [JFK, HND]]						[ICN, JFK, HND, IAD]
	[[ICN, SFO], [ICN, ATL], [SFO, ATL], [ATL, ICN], [ATL,SFO]]	[ICN, ATL, ICN, SFO, ATL, SFO]
	
	입출력 예 설명
	예제 #1
	[ICN, JFK, HND, IAD] 순으로 방문할 수 있습니다.
	
	*/
public class TravelRoute {
	
	public class Ticket{
		private String start;
		private String end;
		private boolean flag;
		
		public Ticket(String start, String end, boolean flag){
			this.start = start;
			this.end = end;
			this.flag = flag;
		}

		@Override
		public String toString() {
			return "Ticket [start=" + start + ", end=" + end + ", flag=" + flag + "]";
		}

		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
		
	}
	// 1. ICN으로 시작 -> 같은 경로일 경우에는 알파벳 순으로 출력 -> 전체 주어진 경로는 모두 사용해야함 
	public static void main(String[] args) {
		String[][] tickets = new String[][]{{"ICN","SFO"}, {"ICN","ATL"}, {"SFO","ATL"}, {"ATL","ICN"},{"ATL","SFO"}};
		TravelRoute travelRoute = new TravelRoute();
		System.out.println(travelRoute.solution(tickets));
	}
    public List<String> solution(String[][] tickets) {
        List<String> answer = new ArrayList<String>();
        LinkedList<String[]> linkedList = new LinkedList<String[]>();
        for(int i=0;i<tickets.length;i++){
        	linkedList.add(tickets[i]);
        }
        
        String start = "ICN";
        answer.add(start);
        answer = recosion(start, linkedList, answer);
        
        return answer;
    }
    
    public List<String> recosion(String start, LinkedList<String[]> linkedList,List<String> answer){
    	
    	int index = linkedList.size();
    	if(index==0){
    		return answer;
    	}
    	String end = "";
    	for(int i=1;i<index;i++){
    		String [] temp = linkedList.removeFirst();
    		if(start==temp[0]){
    			if(end==""||end.compareTo(temp[1])<0){
    				if(end==""){
    					end = temp[1];
    				}
    				else{
    					linkedList.addLast(new String[]{start, end});
    					end = temp[1];
    				}
    			}else{
    				linkedList.addLast(temp);
    			}
    		}else{
    			linkedList.addLast(temp);
    		}
    			
    	}
    	answer.add(end);
    	start = end;
    	return recosion(start,linkedList,answer);
    }
    
    
}
