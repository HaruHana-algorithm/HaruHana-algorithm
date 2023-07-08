package h_2023_07.toss;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1965 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[]=new int[N];
		Integer dp[]=new Integer[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<N;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.fill(dp,1);
		int ans = 0;

		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			ans = Math.max(dp[i], ans);
		}
		System.out.println(ans);
	}
}
