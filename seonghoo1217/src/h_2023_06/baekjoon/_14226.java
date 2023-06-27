package h_2023_06.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _14226 {

	static class Emoji{
		int clipboard=0;
		int view=0;
		int cnt =0;

		public Emoji(int clipboard, int view, int second) {
			this.clipboard = clipboard;
			this.view = view;
			this.cnt = second;
		}
	}

	static boolean visited[][]=new boolean[1001][1001];

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int target = Integer.parseInt(br.readLine());
		bfs(target);
	}

	private static void bfs(int target) {
		Queue<Emoji> q =new LinkedList<>();
		q.offer(new Emoji(0,1,0));
		visited[0][1]=true;

		while (!q.isEmpty()){
			Emoji current = q.poll();

			if (current.view==target){
				System.out.println(current.cnt);
				return;
			}

			q.offer(new Emoji(current.view, current.view ,current.cnt +1));

			if (current.clipboard!=0&&current.view+current.clipboard<=target&&!visited[current.clipboard][current.view+ current.clipboard]){
				q.offer(new Emoji(current.clipboard, current.view+ current.clipboard, current.cnt +1));
				visited[current.clipboard][current.clipboard+ current.view]=true;
			}

			if (1<= current.view&&!visited[current.clipboard][current.view-1]){
				q.offer(new Emoji(current.clipboard, current.view-1,current.cnt +1));
				visited[current.clipboard][current.view-1]=true;
			}
		}
	}
}
