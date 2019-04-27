package test;

import java.util.LinkedList;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 test7 = new Test7();
		System.out.println(test7.solution("browoanoommnaon"));
	}
	public String solution(String cryptogram) {
        String answer = "";
        LinkedList<String> linkedList = new LinkedList<String>();
        char[] a = cryptogram.toCharArray();
        
        for(int i=0;i<a.length;i++) {
        	linkedList.add(String.valueOf(a[i]));
        }
        String start = linkedList.remove();
        
        answer = recursion(linkedList, start, false);
        return answer;
    }
	public String recursion(LinkedList<String> linkedList, String start, boolean flag) {
		String answer ="";
		for(int i=1;i<linkedList.size();i++) {
			if(start!=linkedList.peek()) {
				System.out.println("start1 ="+start);
				linkedList.addLast(start);
				start = linkedList.remove();
			}
			if(start==linkedList.peek()) {
				System.out.println("start2 ="+start);
				start = linkedList.remove();
				flag = true;
			}
		}
		
		if(flag == false) {
			while(linkedList.size()>0) {
				answer = answer+linkedList.remove();
			}
			return answer;
		}
		start = linkedList.remove();
		flag = false;
		return recursion(linkedList, start, flag);
	}
}
