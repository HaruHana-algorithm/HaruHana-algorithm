package h_2023_05.programmers;

import java.util.ArrayList;
import java.util.List;

public class 문자열_나누기 {
	public int solution(String s) {
		int answer = 0;
		char first = s.charAt(0);
		int firstNum = 0;
		int diff = 0;
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				answer++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
		}
		return answer;
	}
}
