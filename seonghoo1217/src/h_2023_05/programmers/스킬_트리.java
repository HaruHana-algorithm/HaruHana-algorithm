package h_2023_05.programmers;

public class 스킬_트리 {
	private boolean isValid(String skill, String cur) {
		int bf = 0;
		for (int i = 0; i < skill.length(); i++) {
			int idx = cur.indexOf(skill.charAt(i));
			if (idx == -1) idx = Integer.MAX_VALUE;
			if (idx < bf) return false;
			bf = idx;
		}
		return true;
	}

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (String cur : skill_trees) {
			answer += isValid(skill, cur) ? 1 : 0;
		}
		return answer;
	}

}
