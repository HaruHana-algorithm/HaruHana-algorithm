package h_2023_04.programmers;

public class 연속된_부분수열의_합 {
	static class Solution {
		public int[] solution(int[] sequence, int k) {

			int N = sequence.length;
			int left = 0, right = N;
			int sum = 0;
			for(int L = 0, R = 0; L < N; L++) {
				while(R < N && sum < k) {
					sum += sequence[R++];
				}

				if(sum == k) {
					int range = R - L - 1;
					if((right - left) > range) {
						left = L;
						right = R - 1;
					}
				}

				sum -= sequence[L];
			}

			int[] answer = {left, right};

			return answer;
		}
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		int [] sequence={1,2,3,4,5};
		int k=7;
		solution.solution(sequence,k);
	}
}
