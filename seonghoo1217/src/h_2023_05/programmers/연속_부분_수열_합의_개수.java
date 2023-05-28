package h_2023_05.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 연속_부분_수열_합의_개수 {
	public int solution(int[] elements) {
		int [] copy=new int[elements.length*2];
		for (int i=0;i<elements.length;i++){
			copy[i]=copy[i+elements.length]=elements[i];
		}

		HashSet<Integer> hs=new HashSet<>();

		for (int i=1;i<=elements.length;i++){
			for (int j=0;j<elements.length;j++){
				hs.add(Arrays.stream(copy,j,j+i).sum());
			}
		}
		return hs.size();
	}

	public static void main(String[] args) {
		int[] el={7,9,1,1,4};
		연속_부분_수열_합의_개수 solution=new 연속_부분_수열_합의_개수();
		solution.solution(el);
	}
}
