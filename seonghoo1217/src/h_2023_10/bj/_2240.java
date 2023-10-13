package h_2023_10.bj;

import java.io.*;
import java.util.StringTokenizer;

public class _2240 {

    static int T,W;
    static int [] arr;
    static int cache [][][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        arr=new int[T+1];
        for (int i=1;i<=T;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        cache=new int[3][T+1][W+2];

        for (int i=1;i<=T;i++){
            for (int k=1;k<=W+1;k++){
                if (arr[i]==1){
                    cache[1][i][k]=Math.max(cache[1][i-1][k],cache[2][i-1][k-1])+1;
                    cache[2][i][k]=Math.max(cache[2][i-1][k],cache[1][i-1][k-1]);
                }else {
                    if (i==1&&k==1) continue; //안움직이는게 좋음 맨처음위치가 1이기에 2에떨어진다면
                    cache[1][i][k]=Math.max(cache[1][i-1][k],cache[2][i-1][k-1]);
                    cache[2][i][k]=Math.max(cache[2][i-1][k],cache[1][i-1][k-1])+1;
                }
            }
        }
        int result = 0;
        for (int i = 1; i <= W + 1; i++) {
            result = Math.max(result, Math.max(cache[1][T][i], cache[2][T][i]));
        }

        System.out.println(result);
    }
}
