package h_2023_05.programmers;

import java.util.Arrays;

public class 과일_장수 {
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		int N = score.length;
		for (int i=N-1;i>=0;i--){
			if ((N-i)%m==0)answer+=score[i]*m;
		}
		return answer;
	}

	public static void main(String[] args) {
		int k=4;
		int m=3;
		int [] score={4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		과일_장수 solution=new 과일_장수();
		solution.solution(k,m,score);
	}
}
