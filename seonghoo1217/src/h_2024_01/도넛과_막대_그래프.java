package h_2024_01;

import java.util.HashMap;

public class 도넛과_막대_그래프 {
    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}, {2, 6}, {5, 6}, {6, 7}, {7, 8}, {8, 9}, {9, 10}, {10, 2}};
        int[] answer = solution(edges);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    static class ExchangeCnt {
        int given = 0;
        int received = 0;
    }

    public static int[] solution(int[][] edges) {
        int[] answer = {0, 0, 0, 0};

        HashMap<Integer, ExchangeCnt> exchangeCnts = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            if (!exchangeCnts.containsKey(a)) {
                exchangeCnts.put(a, new ExchangeCnt());
            }
            if (!exchangeCnts.containsKey(b)) {
                exchangeCnts.put(b, new ExchangeCnt());
            }

            exchangeCnts.get(a).given += 1;
            exchangeCnts.get(b).received += 1;
        }

        for (Integer key : exchangeCnts.keySet()) {
            ExchangeCnt exchangeCnt = exchangeCnts.get(key);
            if (exchangeCnt.given >= 2 && exchangeCnt.received == 0) {
                answer[0] = key;
            } else if (exchangeCnt.given == 0 && exchangeCnt.received > 0) {
                answer[2] += 1;
            } else if (exchangeCnt.given >= 2 && exchangeCnt.received >= 2) {
                answer[3] += 1;
            }
        }

        answer[1] = (exchangeCnts.get(answer[0]).given - answer[2] - answer[3]);

        return answer;
    }

}
