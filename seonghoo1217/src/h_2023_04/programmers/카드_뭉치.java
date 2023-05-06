package h_2023_04.programmers;


public class 카드_뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int card1Idx=0,card1Len=cards1.length;
		int card2Idx=0,card2Len= cards2.length;
		for (int i=0;i<goal.length;i++){
			String point = goal[i];
			if (card1Idx<card1Len&&cards1[card1Idx].equals(point)) card1Idx++;
			else if(card2Idx<card2Len&&cards2[card2Idx].equals(point)) card2Idx++;
			else return "No";
		}
		return answer;
	}
}
