package h_2023_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 문자열_재정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        Integer sum = 0;
        List<Character> characters = new ArrayList<>();
        for (Character c : target.toCharArray()){
            if (Character.isDigit(c)) sum+= Character.getNumericValue(c);
            else {
                characters.add(c);
            }
        }

        characters.stream().sorted().forEach(System.out::print);
        System.out.print(sum);
    }
}
