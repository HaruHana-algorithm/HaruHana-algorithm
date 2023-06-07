package h_2023_06;

import java.util.HashMap;
import java.util.HashSet;

public class 의상 {
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String,Integer> hs=new HashMap<>();
		for (String[] c:clothes){
			hs.put(c[1],hs.getOrDefault(c[1],1)+1);
		}
		for (String key:hs.keySet()){
			answer*=hs.get(key);
		}
		return answer-1;
	}

	public static void main(String[] args) {
		String[][] c={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		의상 solution=new 의상();
		solution.solution(c);
	}
}
