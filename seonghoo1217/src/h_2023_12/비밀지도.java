package h_2023_12;

import java.util.Scanner;

public class 비밀지도 {
    public static void main(String args[]) throws Exception {
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }*/
        int row;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
            System.out.println(arr1[i] | arr2[i]);

            row = arr1[i] | arr2[i];
            System.out.println("r="+row);
            System.out.printf("[");
            for (int j = arr1.length - 1; j >= 0; j--) {
                if (((row >> j) & 1) == 1)
                    System.out.printf("#");
                else
                    System.out.printf(" ");
            }
            System.out.printf("]\n");
        }
    }
}
