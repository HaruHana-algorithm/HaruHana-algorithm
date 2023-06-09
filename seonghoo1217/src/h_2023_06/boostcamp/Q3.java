package h_2023_06.boostcamp;

import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		int [][] test={{4,9,2},{3,5,7},{8,1,6}};
		int [][] copy=new int[test.length][test.length];
		for (int i=0;i<test.length;i++){
			for (int k=0;k< test.length;k++){
				i=(i+1)%3;
				copy[i][k]=test[k][i];
			}
		}
		for (int i[]:copy){
			for (int c: i){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
