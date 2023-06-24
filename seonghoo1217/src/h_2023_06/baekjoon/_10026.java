package h_2023_06.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _10026 {
	static char [][] map;
	static boolean visit[][];
	static int dirX[] = {0, 0, -1, 1};
	static int dirY[] = {-1, 1, 0, 0};

	static char current;
	static int nowX, nowY, N;

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    N=Integer.parseInt(br.readLine());
		map =new char[N][N];
		for (int i=0;i<N;i++){
			String line = br.readLine();
			for (int k=0;k<N;k++){
				map[i][k]=line.charAt(k);
			}
		}

		int count = 0;

		for (int i=0;i<N;i++){
			for (int k=0;k<N;k++){
				if(!visit[i][k]) {
					dfs(i,k);
					count++;
				}
				}
		}

		int normal_cnt = count;
		count=0;
		visit = new boolean[N+1][N+1];

		// dltonism 인 경우
		// G를 R로 바꿔주고 돌린다.

		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(map[i][j]=='G'){
					map[i][j] = 'R'; // G를 R로 바꿔준다.
				}
			}
		}
		//

		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(!visit[i][j]){
					dfs(i,j);
					count++;
				}
			}
		}
		int abnormal_cnt = count;
		System.out.println(normal_cnt + " " + abnormal_cnt);
	}

	public static void dfs(int x, int y){
		visit[x][y] = true;
		char tmp_char = map[x][y];
		for(int i=0; i<4; i++){
			int new_x = x+dirX[i];
			int new_y = y+dirY[i];

			if (new_x<0 || new_y<0 || new_x>N || new_y>N){
				continue;
			}

			if (!visit[new_x][new_y] && map[new_x][new_y] == tmp_char){
				dfs(new_x, new_y);
			}
		}
	}
}
