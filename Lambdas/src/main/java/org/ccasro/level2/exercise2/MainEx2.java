package org.ccasro.level2.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class MainEx2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,66,77,7,1,0);

        String result = stringInteger(numbers);

        System.out.println(result);
    }

    private static String stringInteger (List<Integer> intList){
        return intList.stream().map(n->(n%2==0 ? "e" : "o") + n).collect(Collectors.joining(", "));
    }
}
