package university;

import java.io.*;

public class _1이될때까지 {

    public static int N;
    public static int K;
    public static int cnt=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        while (N!=1){
            if (N%K==0){
                divideByk();
            }else {
                minusOne();
            }
        }

        bw.write("Answer:"+cnt);
        bw.flush();
        bw.close();
    }

    public static void minusOne(){
        N-=1;
        cnt++;
    }

    public static void divideByk(){
        N/=K;
        cnt++;
    }
}
