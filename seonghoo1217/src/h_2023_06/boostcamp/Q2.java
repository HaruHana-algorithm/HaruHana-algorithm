package h_2023_06.boostcamp;

public class Q2 {
	public static void main(String[] args) {
		int year=2024;
		if ((year%4==0&&year%1000!=0)||year%400==0) System.out.println("윤년");
	}
}
