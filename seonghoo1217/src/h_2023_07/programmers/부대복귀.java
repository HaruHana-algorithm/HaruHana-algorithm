package h_2023_07.programmers;

import java.util.*;

public class 부대복귀 {
	private static List<List<Integer>> graph;
	private static int[] dis;
	private static final int MAX = 1_000_000_000;

	public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
		graph=new ArrayList<>();

		for(int i=0; i<n+1; i++) graph.add(new ArrayList<>());

		for (int[] road:roads){
			int s = road[0];
			int e = road[1];

			graph.get(s).add(e);
			graph.get(e).add(s);
		}

		dis=new int[n+1];
		int answer[]=new int[sources.length];
		Arrays.fill(dis,MAX);
		dijkstra(destination);

		for (int i=0;i<sources.length;i++){
			System.out.println("source="+sources[i]);
			System.out.println("DIS="+dis[sources[i]]);
			if (dis[sources[i]]<MAX){
				answer[i]=dis[sources[i]];
			}else {
				answer[i]=-1;
			}
		}
		return answer;
	}

	private static void dijkstra(int destination) {
		Queue<Integer> q = new LinkedList<>();
		q.add(destination);
		dis[destination]=0;

		while (!q.isEmpty()){
			int current = q.poll();

			for (int i=0;i<graph.get(current).size();i++){
				int now = graph.get(current).get(i);
				System.out.println("current="+current);
				System.out.println("now="+now);
				System.out.println("dis_cur="+dis[current]);
				System.out.println("dis_now="+dis[now]);
				if (dis[now]>dis[current]){
					dis[now]=dis[current]+1;
					q.add(now);
				}
			}
		}
	}

	public static void main(String[] args) {
		int n=5;
		int [][] roads={{1, 2}, {1, 4}, {2, 4},{2, 5}, {4, 5}};
		int [] sources={1,3,5};
		int dest=5;
		solution(n,roads,sources,dest);
	}
}