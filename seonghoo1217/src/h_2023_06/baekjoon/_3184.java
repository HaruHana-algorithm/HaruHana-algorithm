package h_2023_06.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _3184 {
	static int h,w;
	static char[][]map;
	static boolean[][] visited;
	static int sheep=0,wolf=0;
	static int[][] move = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		int answerSheep=0,answerWolf=0;
		map=new char[h][w];
		visited=new boolean[h][w];
		for (int i=0;i<h;i++){
			map[i]=br.readLine().toCharArray();
		}

		for (int i=0;i<h;i++) {
			for (int k=0;k<w;k++){
				if (!visited[i][k]&&(map[i][k]=='o'||map[i][k]=='v')){
					sheep=wolf=0;
					dfs(i,k);
					if (sheep>wolf)
						answerSheep+=sheep;
					else
						answerWolf+=wolf;
				}
			}
		}
		System.out.println(answerSheep+" "+answerWolf);
	}

	public static void dfs(int x,int y){
		visited[x][y]=true;

		if (map[x][y]=='v')
			wolf++;
		if (map[x][y]=='o')
			sheep++;
		int nowX,nowY;

		for (int i=0;i<4;i++){
			nowX=x+move[i][0];
			nowY=y+move[i][1];

			if(nowX<0 || nowY<0 || nowX>=h || nowY>=w || visited[nowX][nowY] || map[nowX][nowY]=='#')
				continue;

			visited[nowX][nowY]=true;
			dfs(nowX,nowY);
		}
	}
}
