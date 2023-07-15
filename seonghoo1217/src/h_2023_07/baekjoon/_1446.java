package h_2023_07.baekjoon;

import org.w3c.dom.Node;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _1446 {
	static Node[] graph;
	static int result=0;
	static int N,D;
	static int[] dist;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		dist=new int[D+1];

		for (int i=0;i<D+1;i++){
			dist[i]=i;
		}
		graph=new Node[N];

		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			graph[i]=new Node(start,end,weight);
		}

		dijkstra(0);
	}

	private static void dijkstra(int start) {
		PriorityQueue<Node> q= new PriorityQueue<Node>();
		q.offer(new Node(start,0,0));
		dist[start]=0;

		while (!q.isEmpty()){
			Node cur = q.poll();
			int end = cur.end;
			boolean check=false;
			for (Node n:graph) {
				if (n.start >= end) {
					if (n.end>D) continue;
					int temp = n.start - end;
					check = true;
					if (dist[n.end] > dist[end] + n.distance + temp) {
						dist[n.end] = dist[end] + n.distance + temp;
						q.offer(new Node(end, n.end, dist[n.end]));
					}
				}
			}
			dist[D]=Math.min(dist[end]+D-end,dist[D]);
		}
	}

	static class Node implements Comparable<Node> {

		private int start;
		private int end;
		private int distance;

		public Node(int start, int end, int distance) {
			this.start = start;
			this.end = end;
			this.distance = distance;
		}

		@Override
		public int compareTo(Node o) {
			return this.start-o.start;
		}
	}
}
