package h_2023_04.programmers;

public class 크기가_작은_부분_문자열 {
	public static class SmallSubstring {
		public int solution(String t, String p) {
			int len = p.length();
			long num = Long.parseLong(p);
			int result = 0;

			for (int i = 0; i < t.length() - len + 1; i++) {
				long diff = Long.parseLong(t.substring(i, i + len));
				if (diff <= num) result++;
			}
			return result;
		}

		public static void main(String[] args) {
			SmallSubstring smallSubstring = new SmallSubstring();
			System.out.println(smallSubstring.solution("3141592", "271"));  // 2
			System.out.println(smallSubstring.solution("500220839878", "7"));  // 8
			System.out.println(smallSubstring.solution("10203", "15"));  // 3
		}
	}
}
