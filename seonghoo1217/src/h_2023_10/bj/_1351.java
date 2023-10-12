package h_2023_10.bj;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _1351 {
    static int p;
    static int q;
    static Map<Long,Long> map=new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        long target = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        System.out.println(solve(target));
    }

    public static long solve(long target){
        if (target==0) return 1;
        if (map.containsKey(target)) return map.get(target);

        long a = (long) Math.floor(target / p);
        long b = (long) Math.floor(target / q);

        map.put(target,solve(a)+solve(b));

        return map.get(target);
    }
}
