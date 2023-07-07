package h_2023_07.toss;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class _1944 {
	static ArrayList<int[]> steps;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int n = scann.nextInt();

		steps = new ArrayList<int[]>();

		BigInteger count = new BigInteger("2");
		System.out.println(count.pow(n).subtract(new BigInteger("1")));

		if(n <= 20) {
			hanoi(n, 1, 3, 2);

			for (int i = 0; i < steps.size(); i++) {
				int[] step = steps.get(i);
				System.out.println(step[0] + " " + step[1]);
			}
		}
	}

	private static void hanoi(int n, int from, int to, int via) {
		if(n == 1) {
			steps.add(new int[] {from, to});
		}else {
			hanoi(n-1, from, via, to);
			steps.add(new int[] {from, to});
			hanoi(n-1, via, to, from);
		}
	}
}
