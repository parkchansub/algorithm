package programmers.level3;
//프로그래머스 - 카카오프렌즈 컬러링북
/*
	[0][0]	[1][0]	[2][0]	[3][0]	[4][0]	[5][0]
	[0][1]	[1][1]	[2][1]	[3][1]	[4][1]	[5][1]
	[0][2]	[1][2]	[2][2]	[3][2]	[4][2]	[5][2]
	[0][3]	[1][3]	[2][3]	[3][3]	[4][3]	[5][3]
	
	
	1	1	1	0	0	0
	1	2	0	0	0	0
	1	2	0	0	0	0
	0	0	1	1	3	3

*/
public class Test1 {

	public static void main(String[] args) {
		int[][] picture = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		Test1 test1 = new Test1();
		System.out.println(picture.length);
		test1.solution(6, 4, picture);
	}
	
	public int[] solution(int m, int n, int[][] picture) {
	    int numberOfArea = 0;
	    int maxSizeOfOneArea = 0;
	    
	    dfs(m,n,picture, 0,0,0);
	    
	    int[] answer = new int[2];
	    answer[0] = numberOfArea;
	    answer[1] = maxSizeOfOneArea;
	    return answer;
	}
	public int[] dfs(int m, int n, int[][] picture, int i,int j, int sum){
		int[] answer = new int[2];
		
		if(m==i+1){
			return answer;
		}
		if(n==j+1){
			j = 0;
			return dfs(m, n, picture, i+1, j, 0);
		}
		
		if(picture[i][j] == picture[i+1][j]){
			sum++;
		}
		
		
		return dfs(m, n, picture, i, j+1, 0);
	}
	
	
	
}
