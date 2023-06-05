package h_2023_06;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i=0;i<lost.length;i++){
			for (int k=0;k<reserve.length;k++){
				if (lost[i]==reserve[k]){
					answer++;
					lost[i]=-1;
					reserve[k]=-1;
					break;
				}
			}
		}

		for (int i=0;i<lost.length;i++){
			for (int k=0;k<reserve.length;k++){
				if ((lost[i]-1==reserve[k])||(lost[i]+1==reserve[k])){
					answer++;
					reserve[k]=-1;
					break;
				}
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		int n=3;
		int l[]={3};
		int r[]={1};
		체육복 solution=new 체육복();
		solution.solution(n,l,r);
	}
}
