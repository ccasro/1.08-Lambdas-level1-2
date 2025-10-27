package org.ccasro.level2.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainEx4 {

    public static void main(String[] args){
        List<Object> list = new ArrayList<>(List.of("Avoid",33,"carl",100,"Hello world","3.14","-2","Jupiter","2","a"));


        list.sort(
                Comparator.comparingInt((Object o) ->
                        (o instanceof String s && s.toLowerCase().contains("e")) ? 0 :
                                (o instanceof String ? 1 : 2)
                ).thenComparing(o -> {
                    if (o instanceof String s) {
                        return s.isEmpty() ? Character.MAX_VALUE : Character.toLowerCase(s.charAt(0));
                    } else if (o instanceof Number n) {
                        return n.doubleValue();
                    } else {
                        return Character.MAX_VALUE;
                    }
                }, Comparator.comparingDouble(o -> o instanceof Number n ? n.doubleValue() : 0))
        );

        list.replaceAll(o -> (o instanceof String s) ? s.replace('a', '4') : o);

        System.out.println("Numeric elements: ");
        list.stream().filter(o -> o instanceof Number || (o instanceof String s && isNumeric(s))).forEach(System.out::println);

    }

    private static boolean isNumeric(String s){
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
