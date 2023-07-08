package h_2023_07.toss;

import java.util.*;

class Solution {
	public int solution(String s, int N) {
		int answer =-1;
		int L=s.length();
		HashMap<String,Integer> hs=new HashMap<>();
		for(int i=0;i<L-N;i++){
			String temp=s.substring(i,i+N);
			hs.put(temp,hs.getOrDefault(temp,0)+1);
		}
		System.out.println(hs.toString());
		String max="";
		int ma=0;
		for (String key:hs.keySet()){
			if(hs.get(key)>ma){
				max=key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		solution.solution("1451232125",2);
	}
}