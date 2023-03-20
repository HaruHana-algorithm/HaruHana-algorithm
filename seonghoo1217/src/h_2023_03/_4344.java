package h_2023_03;

import java.io.*;
import java.util.StringTokenizer;

public class _4344 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			int [] scores=new int[M];

			double sum=0;
			for (int k=0;k<M;k++){
				scores[k]=Integer.parseInt(st.nextToken());
				sum+=scores[k];
			}

			double avg = sum / M;
			double count=0;
			for (int score:scores){
				if (score>avg) count++;
			}
			double per = (count/ M ) * 100;
			System.out.println(String.format("%.3f",per)+"%");
		}
	}
}
