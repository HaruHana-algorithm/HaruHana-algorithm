package h_2023_06.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단사전 {
	static int answer = 0;
	static int [] dx={1,0,-1,0};
	static int [] dy={0,1,0,-1};
	public int solution(int[][] maps) {
		int [][] visited=new int[maps.length][maps[0].length];
		bfs(maps,visited);
		answer=visited[maps.length-1][maps[0].length];

		if (answer==0) answer=-1;
		return answer;
	}

	public void bfs(int maps[][],int [][] visited){
		int x=0;
		int y=0;
		visited[x][y]=1;
		Queue<int[]> queue=new LinkedList<>();
		queue.add(new int[]{x,y});

		while (!queue.isEmpty()){
			int[] current = queue.remove();
			int currentX = current[0];
			int currentY = current[1];

			for (int i=0;i<4;i++){
				int nowX = currentX + dx[i];
				int nowY = currentY + dy[i];

				if (nowX<0||nowX>maps.length-1||nowY<0||nowY>maps[0].length) continue;

				if (visited[nowX][nowY]==0&&maps[nowX][nowY]==1){
					visited[nowX][nowY]=visited[currentX][currentY]+1;
					queue.add(new int[]{nowX,nowY});
				}
			}
		}
	}
}
