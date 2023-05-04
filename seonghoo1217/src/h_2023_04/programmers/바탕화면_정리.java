package h_2023_04.programmers;

public class 바탕화면_정리 {
	class Solution {
		public int[] solution(String[] wallpaper) {
			int lowRow,lowCol;
			lowRow=lowCol=Integer.MAX_VALUE;
			int maxRow,maxCol;
			maxRow=maxCol=Integer.MIN_VALUE;

			int r = wallpaper.length;
			int c = wallpaper[0].length();
			for (int i = 0; i< r; i++){
				for (int k = 0; k< c; k++){
					if (wallpaper[i].charAt(k)=='#'){
						lowRow=Math.min(i,lowRow);
						lowCol=Math.min(k,lowCol);
						maxRow=Math.max(i,maxRow);
						maxCol=Math.max(k,maxCol);
					}
				}
			}

			return new int[]{lowRow,lowCol,maxRow+1,maxCol+1};
		}
	}
}
