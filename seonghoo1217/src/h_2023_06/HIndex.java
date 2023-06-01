package h_2023_06;

import java.util.Arrays;

public class HIndex {
	public int solution(int[] citations) {
		int temp = 0;
		Arrays.sort(citations);
		for (int i=0;i<citations.length;i++){
			int smaller = Math.min(citations[i], citations.length - 1);
			if (smaller>=temp)
				temp=Math.max(temp,smaller);
			else
				break;
		}
		return temp;
	}

	public static void main(String[] args) {
		int [] c={3, 0, 6, 1, 5};
		HIndex solution=new HIndex();
		solution.solution(c);
	}
}
