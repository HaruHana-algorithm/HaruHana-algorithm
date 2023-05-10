package h_2023_04.programmers;

public class 마법의_엘레베이터 {
	public int solution(int storey) {
		int answer = 0;

		while (storey != 0) {
			int cur = storey % 10;
			int next = (storey / 10) % 10;
			System.out.println("storey="+storey);
			System.out.println("cur="+cur);
			System.out.println("next="+next);

			if (cur > 5) {
				answer += 10 - cur;
				storey += 10;
			} else if (cur == 5) {
				answer += 5;
				storey += next >= 5 ? 10 : 0;
			} else {
				answer += cur;
			}

			storey /= 10;
		}

		return answer;
	}

	public static void main(String[] args) {
		마법의_엘레베이터 solution=new 마법의_엘레베이터();
		solution.solution(16);
	}
}
