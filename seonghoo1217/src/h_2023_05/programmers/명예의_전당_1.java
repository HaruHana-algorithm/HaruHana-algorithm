package h_2023_05.programmers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_1 {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> sc = new ArrayList();
		for (int i=0; i<score.length; i++) {
			if (i<k-1){
				sc.add(score[i]);
				sc.sort(Collections.reverseOrder());
				answer[i]=sc.get(sc.size()-1);
			} else if (i>=k-1){
				sc.add(score[i]);
				sc.sort(Collections.reverseOrder());
				answer[i]=sc.get(k-1);
			}
		}
		return answer;
	}
}
