package h_2023_04.programmers;

public class 점_찍기 {
	public long solution(int k, int d) {
		long answer=0;
		for (long i=0;i<=d/k;i++){
			long x = i * k;
			long y = (long) Math.sqrt((long) Math.pow(d, 2) - (long) Math.pow(x, 2)) / k;
			answer+= y+1;
		}
		return answer;
	}

	public static void main(String[] args) {
		점_찍기 solution=new 점_찍기();
		System.out.println(solution.solution(1,5));
	}
}
