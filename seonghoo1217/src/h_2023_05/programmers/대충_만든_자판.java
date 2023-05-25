package h_2023_05.programmers;


import java.util.HashMap;

public class 대충_만든_자판 {
	public int[] solution(String[] keymap, String[] targets) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int[] answer=new int[targets.length];
		for(String key : keymap) {
			for(int i=0 ; i<key.length() ; i++) {
				char c = key.charAt(i);
				if(!hm.containsKey(c) || i<hm.get(c)) {
					hm.put(c, i+1);
				}
			}
		}
		for (int i=0;i<targets.length;i++){
			int temp=0;
			for (int k=0;k<targets[i].length();k++){
				char c = targets[i].charAt(k);
				if (!hm.containsKey(c)) {
					temp=0;
					break;
				}
				temp+=hm.get(c);
			}
			answer[i]=temp==0?-1:temp;
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] keymap={"ABACD", "BCEFD"};
		String[] target={"ABCD","AABB"};
		대충_만든_자판 solution=new 대충_만든_자판();
		solution.solution(keymap,target);
	}
}
