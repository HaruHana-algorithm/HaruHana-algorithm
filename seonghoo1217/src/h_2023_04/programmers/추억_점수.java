package h_2023_04.programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class 추억_점수 {
	static class Solution {
		private Map<String,Integer> userInfo=new HashMap<>();
		public int[] solution(String[] name, int[] yearning, String[][] photo) {
			LinkedList<Integer> answer= new LinkedList<>();
			for (int i=0;i<name.length;i++){
				userInfo.put(name[i],yearning[i]);
			}
			for (String[] o:photo){
				int sum=0;
				for (int i=0;i<o.length;i++){
					if (userInfo.containsKey(o[i])){
						sum+=userInfo.get(o[i]);
					}
				}
				answer.add(sum);
			}
			return answer.stream().mapToInt(Integer::intValue).toArray();
		}

		public static void main(String[] args) {
			Solution solution=new Solution();
			String[] name={"may", "kein", "kain", "radi"};
			int [] yearing={5, 10, 1, 3};
			String[][]photo={
					{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}
			};
			solution.solution(name,yearing,photo);
		}
	}
}
