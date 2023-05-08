package h_2023_04.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 개인정보_수집 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int compare = changeFormat(today, 0);
		List<Integer> answer=new ArrayList<>();
		HashMap<String,Integer> termMap=new HashMap<>();
		for (int i=0;i<terms.length;i++){
			String[] term = terms[i].split(" ");
			termMap.put(term[0],Integer.parseInt(term[1]));
		}

		for (int i=0;i<privacies.length;i++){
			String[] privacy = privacies[i].split(" ");
			int target = changeFormat(privacy[0], termMap.get(privacy[1]));
			if (target-1<compare) {
				answer.add(i+1);
			}
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int changeFormat(String date,int deadline){
		String[] splitDate = date.split("\\.");
		int year = Integer.parseInt(splitDate[0]) * 28 * 12;
		int month = Integer.parseInt(splitDate[1]) * 28;
		int day = Integer.parseInt(splitDate[2]);
		return year + month + day +(deadline*28);
	}

	public static void main(String[] args) {
		개인정보_수집 solution=new 개인정보_수집();
		String today="2022.05.19";
		String[] terms={"A 6", "B 12", "C 3"};
		String[] pri={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		System.out.println(Arrays.toString(solution.solution(today, terms, pri)));
	}
}
