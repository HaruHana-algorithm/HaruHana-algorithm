package h_2023_07.toss;

import java.io.*;

public class 피보나치_비스무리한_수열 {
	static long []p;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		p=new long[117];
		p[0]=p[1]=p[2]=1;
		pibonacci();

		System.out.println(p[N-1]);
	}

	public static void pibonacci(){
		for (int i=3;i<N;i++){
			p[i]=p[i-1]+p[i-3];
		}
	}
}
