package h_2023_06.baekjoon;

import org.w3c.dom.Node;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _14502 {

	static int [][] map;
	static int N,M;
	static int dirX[] = {0, 0, -1, 1};
	static int dirY[] = {-1, 1, 0, 0};

	static int maxSafeZone = Integer.MIN_VALUE;
	static int nowX, nowY;


	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map=new int[N][M];

		for (int i=0;i<N;i++){
			String line = br.readLine();
			for (int j=0;j<M;j++){
				map[i][j]=Character.getNumericValue(line.charAt(j));
			}
		}
		dfs(0);
	}


	public static void dfs(int cnt){
		if (cnt==3){
			bfs();
			return;
		}

		for (int i=0;i<N;i++){
			for (int k=0;k<M;k++){
				if (map[i][k]==0){
					map[i][k]=1;
					dfs(cnt+1);
					map[i][k]=0;
				}
			}
		}
	}

	static void bfs(){
		Queue<Node> q = new LinkedList<>();

		for(int i=0; i<N; i++) {
			for(int k=0; k<M; k++) {
				if(map[i][k] == 2) {
					q.add(new Node(i,k));
				}
			}
		}
		int [][]copy=new int[N][M];

		for (int i=0;i<N;i++){
			copy[i]=map[i].clone();
		}

		while(!q.isEmpty()) {
			Node now = q.poll();
			int x = now.x;
			int y = now.y;

			for(int k=0; k<4; k++) {
				int nx = x + dirX[k];
				int ny = y + dirY[k];

				//연구소 범위 밖이 아니고 빈칸일 경우에만 바이러스를 퍼트린다.
				if(0<=nx && nx<N && 0<=ny && ny<M) {
					if(copy[nx][ny] == 0) {
						q.add(new Node(nx,ny));
						copy[nx][ny] = 2;
					}
				}
			}
		}
		funcSafeZone(copy);
	}
	private static void funcSafeZone(int[][] copyMap) {
		int safeZone =0;
		for(int i=0; i<N ; i++) {
			for(int j=0; j<M; j++) {
				if(copyMap[i][j] == 0) {
					safeZone++;
				}
			}
		}
		if (maxSafeZone < safeZone) {
			maxSafeZone = safeZone;
		}
	}

	static class Node {
		int x;
		int y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
