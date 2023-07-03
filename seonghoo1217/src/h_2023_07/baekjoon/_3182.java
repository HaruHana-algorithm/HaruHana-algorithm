package h_2023_07.baekjoon;

import java.io.*;

public class _3182 {
	static int[] arr;

	static boolean[] visited;

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		int[] answer = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int cnt = 0;
		for (int i = 1; i < N + 1; i++) {
			visited = new boolean[N + 1];
			dfs(i);
			for (int j = 1; j < N + 1; j++) {
				if (visited[j] == true)
					cnt++;
			}
			answer[i] = cnt;
			cnt = 0;
		}
		int max_index = 0;
		for (int i = 1; i < N + 1; i++) {
			if (max < answer[i]) {
				max = answer[i];
				max_index = i;
			}
		}
		System.out.println(max_index);

	}

	static void dfs(int index) {
		visited[index] = true;
		while (!visited[arr[index]]) {
			dfs(arr[index]);
		}
	}
}
