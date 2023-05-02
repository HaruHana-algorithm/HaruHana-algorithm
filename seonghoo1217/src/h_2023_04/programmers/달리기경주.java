package h_2023_04.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class 달리기경주 {
	private static HashMap<String,Integer> score=new HashMap<>();

	public class Solution {
		public String[] solution(String[] players, String[] callings) {
			makeInfo(players);

			Arrays.stream(callings).forEach(player->{
				int rank = score.get(player);
				String front = players[rank - 1];
				players[rank]=front;
				players[rank-1]=player;

				score.put(front,rank);
				score.put(player,rank-1);
			});
			return players;
		}

		private void makeInfo(String[] players) {
			IntStream.range(0, players.length).forEach(index -> {
				score.put(players[index], index);
			});
		}
	}
	
}
