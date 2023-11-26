package h_2023_11.bj;

import java.util.Arrays;
import java.util.Scanner;

public class _13703 {
    static long[][] flee = new long[1000][1000];

    static long dp(int k, int n) {
        if (flee[k][n] != -1) return flee[k][n];
        if (k == 0) return 0;
        if (n == 0) return 1;

        flee[k][n] = dp(k + 1, n - 1) + dp(k - 1, n - 1);
        return flee[k][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int second = scanner.nextInt();

        // Initialize the flee array
        for (int i = 0; i < 1000; i++) {
            Arrays.fill(flee[i], -1);
        }

        System.out.println(dp(height, second));
    }
}
