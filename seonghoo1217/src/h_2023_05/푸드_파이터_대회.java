package h_2023_05;

public class 푸드_파이터_대회 {
	public String solution(int[] food) {
		StringBuilder sb=new StringBuilder();
		for (int i=1;i<food.length;i++){
			food[i]=evenOrOdd(food[i]);
		}
		for (int i=1;i<food.length;i++){
			for (int k=0;k<food[i];k++){
				sb.append(String.valueOf(i));
			}
		}
		return sb.toString()+"0"+sb.reverse().toString();
	}

	public static int evenOrOdd(int target){
		if (target%2==0){
			return target/2;
		}
		return (target-1)/2;
	}

	public static void main(String[] args) {
		푸드_파이터_대회 solution=new 푸드_파이터_대회();
		int [] foods={1, 3, 4, 6};
		System.out.println(solution.solution(foods));
	}
}
