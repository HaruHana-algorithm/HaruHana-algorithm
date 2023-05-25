package h_2023_05.programmers;

import java.util.ArrayList;
import java.util.List;

public class 크기가_작은_부분_문자열 {
	public int solution(String t, String p) {
		int answer = 0;
		int n = p.length();
		int m = t.length();

		List<Long> target=new ArrayList<>();

		for (int i = 0; i< m; i++){
			String temp="";
			if (i+n>m) break;
			for (int k=i;k<i+n;k++){
				temp+=t.charAt(k);
			}
			target.add(Long.parseLong(temp));
		}
		long point = Long.parseLong(p);

		for (long x:target){
			if (x<= point) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		String t="3141592";
		String p="271";
		크기가_작은_부분_문자열 solution=new 크기가_작은_부분_문자열();
		solution.solution(t,p);
	}
}
