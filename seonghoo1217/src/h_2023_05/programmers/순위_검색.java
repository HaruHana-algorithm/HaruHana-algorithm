package h_2023_05.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 순위_검색 {
	/*static List<User> userList=new ArrayList<>();
	static List<Query> queryList=new ArrayList<>();

	public static class Query{
		private String language;
		private String part;
		private String career;
		private String food;
		private int score;

		public Query(String language, String part, String career, String food, int score) {
			this.language = language;
			this.part = part;
			this.career = career;
			this.food = food;
			this.score = score;
		}
	}

	public static class User{
		private String language;
		private String part;
		private String career;
		private String food;
		private int score;

		public User(String language, String part, String career, String food, int score) {
			this.language = language;
			this.part = part;
			this.career = career;
			this.food = food;
			this.score = score;
		}
	}
	public int[] solution(String[] info, String[] query) {
		List<Integer> answer = new ArrayList<>();
		initializeUserList(info);
		initializeQueryList(query);
		for (Query q:queryList){

		}

		return null;
	}

	private static void initializeUserList(String[] info){
		for (String line:info){
			String[] lineInfo = line.split(" ");
			userList.add(new User(lineInfo[0], lineInfo[1], lineInfo[2], lineInfo[3], Integer.parseInt(lineInfo[4])));
		}
	}

	private static void initializeQueryList(String[] query){
		for (String q:query){
			String[] qList = q.split(" and ");
			queryList.add(new Query(qList[0],qList[1],qList[2],qList[3],Integer.parseInt(qList[4])));
		}
	}

	private static int isCorrect(Query q){
		if (q.career.equals("-")||q.language.equals("-")||q.part.equals("-")||q.food.equals("-"))
		for (User u: userList){
			if (u.career.equals(q.career))
		}
	}*/
	static HashMap<String, List<Integer>> map;

	public static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		map = new HashMap<String, List<Integer>>();

		for (int i = 0; i < info.length; i++) {
			String[] p = info[i].split(" ");
			makeSentence(p, "", 0);
		}

		for (String key : map.keySet())
			Collections.sort(map.get(key));

		for (int i = 0; i < query.length; i++) {
			query[i] = query[i].replaceAll(" and ", "");
			String[] q = query[i].split(" ");
			answer[i] = map.containsKey(q[0]) ? binarySearch(q[0], Integer.parseInt(q[1])) : 0;
		}

		return answer;
	}

	// 이분 탐색
	private static int binarySearch(String key, int score) {
		List<Integer> list = map.get(key);
		int start = 0, end = list.size() - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (list.get(mid) < score)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return list.size() - start;
	}

	// info가 포함될 수 있는 문장
	private static void makeSentence(String[] p, String str, int cnt) {
		if (cnt == 4) {
			if (!map.containsKey(str)) {
				List<Integer> list = new ArrayList<Integer>();
				map.put(str, list);
			}
			map.get(str).add(Integer.parseInt(p[4]));
			return;
		}
		makeSentence(p, str + "-", cnt + 1);
		makeSentence(p, str + p[cnt], cnt + 1);
	}
}
