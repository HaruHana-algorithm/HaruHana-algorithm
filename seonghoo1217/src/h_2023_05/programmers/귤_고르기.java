package h_2023_05.programmers;

import java.util.*;

public class 귤_고르기 {
	static HashMap<Integer, Integer> hashMap=new HashMap<>();

	public int solution(int k, int[] tangerine) {
		for (int x:tangerine){
			hashMap.put(x,hashMap.getOrDefault(x,0)+1);
		}
		List<Integer> keylist = new ArrayList<>(hashMap.keySet());
		Collections.sort(keylist, new customComparator());
		int answer = 0;

		// 정렬된 key리스트에서 값을 하나씩 가져와 k에 빼줌
		for (Integer e : keylist) {
			if (k <= 0)
				break;
			answer++;
			k -= hashMap.get(e);
		}
		return answer;
	}

	public class customComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return hashMap.get(o2).compareTo(hashMap.get(o1));
		}
	}

}
