package h_2023_05.programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 튜플 {
	public int[] solution(String s) {
		ArrayList<Integer> answer = new ArrayList<>();
		s = s.substring(2,s.length());
		s = s.substring(0,s.length()-2).replace("},{","-");
		String str[] = s.split("-");
		Arrays.sort(str,new Comparator<String>(){
			public int compare(String o1, String o2){

				return o1.length()-o2.length();
			}
		});

		for(String x : str){
			String[] temp = x.split(",");
			for(int i = 0 ; i < temp.length;i++){
				int n = Integer.parseInt(temp[i]);
				if(!answer.contains(n))
					answer.add(n);
			}
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		String s="{{20,111},{111}}";
		튜플 solution=new 튜플();
		solution.solution(s);
	}
}
