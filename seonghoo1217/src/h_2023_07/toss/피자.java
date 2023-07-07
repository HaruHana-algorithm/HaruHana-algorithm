package h_2023_07.toss;

import java.io.*;

public class 피자 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		dp[2] = 1;
		for (int i = 3; i <= N; i++) {
			dp[i] = i-1 + dp[i-1];
		}
		System.out.print(dp[N]);
	}
}
