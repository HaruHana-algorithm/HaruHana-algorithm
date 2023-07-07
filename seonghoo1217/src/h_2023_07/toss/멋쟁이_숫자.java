package h_2023_07.toss;

public class 멋쟁이_숫자 {
	public int solution(String s){
		Integer biggest=-1;
		int N = s.length();
		for (int i=0;i<N-2;i++){
			if (s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2)){
				biggest=Math.max(biggest,Integer.parseInt(s.substring(i,i+3)));
			}
		}
		return biggest;
	}
}
