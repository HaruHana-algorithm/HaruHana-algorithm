package h_2023_06;

import java.util.*;

public class 기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
		Map<Integer,Integer> score=new LinkedHashMap<>();
		ArrayList<Integer> answer=new ArrayList<>();
		int temp1=0;
		for (int i=0;i<progresses.length;i++){
			int temp2=0;
			int progress = progresses[i];
			int speed = speeds[i];
			while (progress<100){
				progress+=speed;
				temp2++;
			}
			temp1=Math.max(temp1,temp2);
			score.put(temp1,score.getOrDefault(temp1,0)+1);
		}
		System.out.println(score);
		for (int s :score.keySet()){
			answer.add(score.get(s));
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int [] pr={95, 90, 99, 99, 80, 99};
		int [] sp={1, 1, 1, 1, 1, 1};
		기능개발 solution=new 기능개발();
		System.out.println(Arrays.toString(solution.solution(pr,sp)));
	}
}
