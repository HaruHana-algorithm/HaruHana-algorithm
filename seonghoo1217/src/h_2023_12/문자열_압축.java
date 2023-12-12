package h_2023_12;

public class 문자열_압축 {
    public static int solution(String s) {
        int answer = s.length();
        int count = 1;
        for (int i=1;i<answer/2;i++){
            StringBuilder result = new StringBuilder();
            System.out.println("result="+result);
            String base = s.substring(0, i);
            System.out.println("base="+base);
            for(int j=i; j<=s.length(); j+=i){
                int endIdx = Math.min(j + i, s.length());
                String compare = s.substring(j, endIdx);
                System.out.println("compare ="+compare);
                if(base.equals(compare)){
                    count++;
                } else {
                    if(count >= 2){
                        result.append(count);
                    }
                    result.append(base);
                    base = compare;
                    count = 1;
                }
            }
            result.append(base);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";
        solution(s);
    }
}
