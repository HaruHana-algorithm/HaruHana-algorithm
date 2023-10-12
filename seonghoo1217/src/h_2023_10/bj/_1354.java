package h_2023_10.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _1354 {
    static BigInteger p,q,x,y;
    static Map<BigInteger,BigInteger> map=new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        BigInteger target = new BigInteger(st.nextToken());
        p = new BigInteger(st.nextToken());
        q = new BigInteger(st.nextToken());
        x = new BigInteger(st.nextToken());
        y = new BigInteger(st.nextToken());

        System.out.println(solve(target));
    }

    public static BigInteger solve(BigInteger target){
        if (target.equals(BigInteger.ZERO)) return BigInteger.ONE;
        if (map.containsKey(target)) return map.get(target);

        BigInteger a = target.divide(p).min(x);
        BigInteger b = target.divide(q).min(y);

        BigInteger result = solve(a).add(solve(b));
        map.put(target, result);

        return map.get(target);
    }
}
