package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


	/*
	숨바꼭질
	
	문제
	수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다. 
	만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.
	수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
	
	입력
	첫 번째 줄에 수빈이가 있는 위치 N과 동생이 있는 위치 K가 주어진다.
	
	출력
	수빈이가 동생을 찾는 가장 빠른 시간을 출력한다.
	 */


public class Test_1200 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		run();
        bw.flush();
	    br.close();
	    bw.close();
	}
	
	public static void run() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");        
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        Queue q = new LinkedList();
        q.offer(from);

        boolean[] c = new boolean[100001];
        int[] dist = new int[100001];
        
        while (!q.isEmpty()) {
            from = (int) q.poll();
            
            if (from == to) {
                bw.write(dist[from] + "\n");
                break;
            } else {
                if (from-1 >= 0 && !c[from-1] ) {
                    q.offer(from-1);
                    c[from-1] = true;
                    dist[from-1] = dist[from] +1;
                }
                if (from+1 <= 100000 && !c[from+1] ) {
                    q.offer(from+1);
                    c[from+1] = true;
                    dist[from+1] = dist[from] +1;
                }
                if (from*2 <= 100000 && !c[from*2] ) {
                    q.offer(from*2);
                    c[from*2] = true;
                    dist[from*2] = dist[from] +1;
                }
            }
        }
        
    }

}
