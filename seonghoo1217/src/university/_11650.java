package university;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [][] arr=new int[N][2];
        StringTokenizer st;
        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> {
            if (o1[0]==o2[0]){
                return o1[1]-o2[1];
            }else {
                return o1[0]-o2[0];
            }
        });
    }
}
