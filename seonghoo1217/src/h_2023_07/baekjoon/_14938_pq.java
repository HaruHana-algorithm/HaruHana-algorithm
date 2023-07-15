package h_2023_07.baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class _14938_pq {
	static int N,M,R;
	static StringTokenizer st;
	static int[] dist;
	static boolean[] check;
	static int[] item;
	static List<List<farmingInfo>> graph;
	static int answer=0;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		st=new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		check=new boolean[N+1];
		item=new int[N+1];
		dist=new int[N+1];

		st = new StringTokenizer(br.readLine());
		for (int i=1;i<=N;i++){
			item[i]=Integer.parseInt(st.nextToken());
		}
		graph=new ArrayList<>();
		for (int i=0;i<=N;i++){
			graph.add(new ArrayList<>());
		}
		for (int i=1;i<=R;i++){
			st=new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			graph.get(f).add(new farmingInfo(t,d));
			graph.get(t).add(new farmingInfo(f,d));
		}

		for (int i=1;i<=N;i++){
			answer=Math.max(answer,dijkstra(i));
		}
	}

	private static int dijkstra(int start) {
		Arrays.fill(dist,Integer.MAX_VALUE);
		PriorityQueue<farmingInfo> pq=new PriorityQueue<>();
		pq.offer(new farmingInfo(start,0));
		dist[start]=0;

		while (!pq.isEmpty()){
			farmingInfo current = pq.poll();
			int pos = current.node;

			if (!check[pos]){
				check[pos]=true;
				for (farmingInfo f: graph.get(pos)){
					if (!check[f.node]&&dist[f.node]>dist[pos]+f.distance){
						dist[f.node]=dist[pos]+f.distance;
						pq.add(new farmingInfo(f.node,dist[f.node]));
					}
				}
			}
		}

		int result=0;
		for (int i=1;i<=N;i++){
			if (dist[i]<=M){
				result+=item[i];
			}
		}
		return result;
	}


	static class farmingInfo implements Comparable<farmingInfo> {
		private int node;
		private int distance;

		public farmingInfo(int node, int distance) {
			this.node = node;
			this.distance = distance;
		}

		@Override
		public int compareTo(farmingInfo o) {
			return this.distance-o.distance;
		}
	}
}
