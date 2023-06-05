package h_2023_06;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue=new LinkedList<>();
		int sum=0;
		for (int t:truck_weights){
			while (true) {
				if (queue.isEmpty()){
					queue.add(t);
					sum+=t;
					answer++;
					break;
				}
				else if (queue.size()==bridge_length){
					sum-=queue.poll();
				}
				else {
					if (sum+t>weight){
						queue.add(0);
						answer++;
					}
					else {
						queue.add(t);
						sum+=t;
						answer++;
						break;
					}
				}
			}
		}
		return answer+bridge_length;
	}
}
