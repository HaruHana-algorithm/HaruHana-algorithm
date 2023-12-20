package h_2023_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 연결하여가장큰수 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("10","75","7","12","68","5"));

        Collections.sort(list, (a,b)->(a+b).compareTo(b+a));

        System.out.println(list);
    }
}
