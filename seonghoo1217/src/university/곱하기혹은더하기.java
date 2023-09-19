package university;

import java.io.*;

public class 곱하기혹은더하기 {

    public static int answer=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        char[] charArray = br.readLine().toCharArray();
        int answer = plusOrMul(Character.getNumericValue(charArray[0]), charArray[1]);
        for (int i=2;i<charArray.length;i++){
            answer=plusOrMul(answer,charArray[i]);
        }
        bw.write("Answer:"+answer);
        bw.flush();
        bw.close();
    }

    public static int plusOrMul(int a,char b){
        int plus = plus(a, b);
        int multiply = multiply(a, b);
        if (plus >= multiply) return plus;
        else return multiply;
    }

    public static int plus(int a,char b){
        int numB = Character.getNumericValue(b);
        return a+numB;
    }

    public static int multiply(int a,char b){
        int numB = Character.getNumericValue(b);
        return a*numB;
    }
}
