package h_2023_07.toss;

public class 억억단을_외자 {
	public static int[] solution(int e, int[] starts) {
		int map[][]=new int[e][e];
		int[] answer=new int[e];
		for (int i=0;i<e;i++){
			map[0][i]=i+1;
			map[i][0]=i+1;
		}
		for (int i=1;i<e;i++){
			for (int k=1;k<e;k++){
				map[i][k]=map[i][0]*map[0][k];
			}
		}

		return null;
	}

	public static void main(String[] args) {
		int e=8;
		int []s ={1,3,7};
		억억단을_외자 solu=new 억억단을_외자();
		solu.solution(e,s);
 	}
}
