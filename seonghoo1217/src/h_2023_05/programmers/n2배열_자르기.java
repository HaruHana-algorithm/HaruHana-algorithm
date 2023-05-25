package h_2023_05.programmers;


import java.util.Arrays;

public class n2배열_자르기 {
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left + 1)];
		int row = (int) (left / n); // 시작 위치의 행 번호
		int col = (int) (left % n); // 시작 위치의 열 번호

		for (int i = 0; i < answer.length; i++) {
			answer[i] = Math.max(row + 1, col + 1); // 해당 위치의 값을 할당
			col++;

			if (col == n) {
				col = 0;
				row++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int n=3;
		int left=2;
		int right=5;
		n2배열_자르기 solution=new n2배열_자르기();
		System.out.println(Arrays.toString(solution.solution(n,left,right)));
	}
}
