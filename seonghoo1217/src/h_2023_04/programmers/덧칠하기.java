package h_2023_04.programmers;

import java.util.Arrays;

public class 덧칠하기 {
	static class Solution {
		public int solution(int n, int m, int[] section) {
			int answer = 0;
			int max = 0;

			for (int i = 0; i < section.length; i++) {
				if (section[i] < max) {
					continue;
				}

				answer += 1;
				max = section[i] + m;
			}

			return answer;
		}

		public static void main(String[] args) {
			Solution solution=new Solution();
			int n=8;
			int m=4;
			int [] sec={2, 3, 6};
			solution.solution(n,m,sec);
		}
	}
}
