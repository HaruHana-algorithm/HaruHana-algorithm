package h_2023_07.toss;

import java.io.*;
import java.util.StringTokenizer;

public class _1912 {
	static Integer dp[];
	static int arr[];
	static int MAX;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		dp=new Integer[N];
		arr=new int[N];

		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<N-1;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		MAX = arr[0];

		continueSum(N-1);
	}

	private static int continueSum(int i) {
		if (dp[i]==null){
			dp[i]=Math.max(continueSum(i-1)+arr[i],arr[i]);
			MAX=Math.max(dp[i],MAX);
		}

		return dp[i];
	}
}
