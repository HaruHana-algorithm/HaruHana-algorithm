package h_2023_07.toss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 억억단을_외자 {
	public static int[] solution(int e, int[] starts) {
		int N = starts.length;
		int[] answer=new int[N];
		int [] dp=new int[e+1];
		for (int i=1;i<=e;i++){
			for (int k=1;k<=e;k++){
				if (i*k>e) break;
				dp[i*k]++;
			}
		}

		Map<Integer, Integer> startsVal=new HashMap<>();
		for (int i = 0; i< N; i++){
			startsVal.put(starts[i],i);
		}
		Arrays.sort(starts);

		int max = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;

		for (int i = 0; i< N; i++){
			int location = startsVal.get(starts[i]);
			if (temp>=starts[i]){
				answer[location]=temp;
				continue;
			}

			max=Integer.MIN_VALUE;
			temp=Integer.MIN_VALUE;

			for (int k=starts[i];k<=e;k++){
				if (max<dp[k]){
					max=dp[k];
					temp=k;
				}
			}
			answer[location]=temp;
		}

		return answer;
	}

	public static void main(String[] args) {
		int e=8;
		int []s ={1,3,7};
		억억단을_외자 solu=new 억억단을_외자();
		solu.solution(e,s);
 	}
}
