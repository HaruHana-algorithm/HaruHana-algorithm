package h_2023_04.programmers;

import java.util.*;

public class 가장가까운_글자 {
	HashMap<Character,Integer> word=new HashMap<>();
	public int[] solution(String s) {
		int [] answer=new int[s.length()];

		for (int i=0;i<s.length();i++){
			char target = s.charAt(i);
			if (word.get(target)==null){
				answer[i]=-1;
			}else {
				answer[i]=i-word.get(target);
			}
			word.put(target,i);
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		가장가까운_글자 solution=new 가장가까운_글자();
		solution.solution("banana");
	}
}
