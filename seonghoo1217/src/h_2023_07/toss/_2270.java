package h_2023_07.toss;

import java.util.Scanner;

public class _2270 {
	static final int MOD = 1000000;
	static int[] num = new int[100001];
	static int[] pos = new int[100001];
	static int n, x, ans;
	static int pole1, pole2, pole3;

	static void cal(int n) {
		num[0] = 1;
		for (int i = 1; i <= n; i++) {
			num[i] = (num[i - 1] * 2) % MOD;
		}
	}

	static void hanoi(int disc, int to) {
		if (disc == 0) return;

		int now = pos[disc];
		int sub = 0;

		for (int i = 1; i <= 3; i++) {
			if (now != i && to != i)
				sub = i;
		}

		if (now == to) hanoi(disc - 1, to);
		else {
			ans = (ans + num[disc - 1]) % MOD;
			hanoi(disc - 1, sub);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		cal(n);

		pole1 = scanner.nextInt();
		pole2 = scanner.nextInt();
		pole3 = scanner.nextInt();

		for (int i = 0; i < pole1; i++) {
			x = scanner.nextInt();
			pos[x] = 1;
		}
		for (int i = 0; i < pole2; i++) {
			x = scanner.nextInt();
			pos[x] = 2;
		}
		for (int i = 0; i < pole3; i++) {
			x = scanner.nextInt();
			pos[x] = 3;
		}

		hanoi(n, pos[n]);

		System.out.println(pos[n]);
		System.out.println(ans);
	}
}
