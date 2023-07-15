package h_2023_07.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class _14938_bfs {
	static int n, m, r;
	static List<node>[] list;
	static int[] arr;
	static int result;
	static PriorityQueue<node> queue = new PriorityQueue<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		r = Integer.parseInt(s[2]);

		list = new ArrayList[n + 1];
		arr = new int[n + 1];
		String[] s1 = br.readLine().split(" ");
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(s1[i - 1]);
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < r; i++) {
			String[] s2 = br.readLine().split(" ");
			int start = Integer.parseInt(s2[0]);
			int end = Integer.parseInt(s2[1]);
			int distance = Integer.parseInt(s2[2]);
			list[start].add(new node(end, distance));
			list[end].add(new node(start, distance));
		}

		for (int i = 1; i <= n; i++) {
			solve(i);
		}

		System.out.println(result);
	}

	public static void solve(int start) {
		int temp = arr[start];
		boolean[] check = new boolean[n + 1];
		check[start] = true;
		for (node now : list[start]) {
			queue.add(now);
		}
		while (!queue.isEmpty()) {
			node poll = queue.poll();
			if (!check[poll.end] && poll.distance <= m) {
				temp += arr[poll.end];
				check[poll.end] = true;
				for (node next : list[poll.end]) {
					queue.add(new node(next.end, poll.distance + next.distance));
				}
			}
		}
		result = Math.max(temp, result);
	}
}

class node implements Comparable<node> {
	int end;
	int distance;

	public node(int end, int distance) {
		this.end = end;
		this.distance = distance;
	}

	@Override
	public int compareTo(node o) {
		return this.distance - o.distance;
	}
}
