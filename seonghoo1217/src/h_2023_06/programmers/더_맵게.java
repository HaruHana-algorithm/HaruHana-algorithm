package h_2023_06.programmers;

import java.util.PriorityQueue;

public class 더_맵게 {
	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int answer=0;
		for (int s:scoville){
			pq.add(s);
		}

		while (pq.peek()<K){
			if (pq.size()==1){
				return -1;
			}
			pq.add(pq.poll()+(pq.poll()*2));
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int [] scovile={1, 2, 3, 9, 10, 12};
		int k=7;
		더_맵게 so=new 더_맵게();
		so.solution(scovile,k);
	}
}
