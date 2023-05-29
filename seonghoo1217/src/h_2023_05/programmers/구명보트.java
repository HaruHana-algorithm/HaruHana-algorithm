package h_2023_05.programmers;

import java.util.Arrays;

public class 구명보트 {
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		int n = people.length - 1;
		int min=0;
		for (int max=n;min<=max;max--){
			if (people[min]+people[max]<=limit) min++;
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int [] people={70, 50, 80, 50};
		int limit=100;
		구명보트 solution=new 구명보트();
		solution.solution(people,limit);
	}
}
