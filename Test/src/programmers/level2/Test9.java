package programmers.level2;
//  프로그래머스 - 에상 대진표(완료) / 블로그(완료)
public class Test9 {

	public static void main(String[] args) {
		
		Test9 test9 = new Test9();
		System.out.println(test9.solution(8, 4, 7));
	}
	
	public int solution(int n, int a, int b){
        int answer = 0;
        
        return dfs(a,b,answer);
    }
	
	public int dfs(int a, int b, int result){
		
		if(a!=b){
        	if(a%2==0){
        		a = a/2;
        	}
        	else{
        		a= (a+1)/2;
        	}
        	
        	if(b%2==0){
        		b = b/2;
        	}
        	else{
        		b= (b+1)/2;
        	}
        		result++;
        	return dfs(a,b, result);
        }
        else{
        	
        	return result;
        }
	}
}
