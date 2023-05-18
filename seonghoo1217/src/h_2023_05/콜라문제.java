package h_2023_05;

public class 콜라문제 {
	public int solution(int a, int b, int n) {
		int answer = 0;
		while (true){
			if(n<a) break;

			answer+=(n/a)*b;
			int remain = n % a;
			n=(n/a)*b+remain;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a=2;
		int b=1;
		int n=20;
		콜라문제 solution=new 콜라문제();
		System.out.println(solution.solution(a,b,n));
	}
}
