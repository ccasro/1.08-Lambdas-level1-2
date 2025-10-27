package org.ccasro.level1.exercise1;

import java.util.List;

public class MainEx1 {
    public static void main(String[] args){
        List<String> stringList = List.of("Hello","Flower","example","Clear","Avoid","Important","Seal","Soul"
        );

        System.out.println(listWithO(stringList));

    }

    private static List<String> listWithO(List<String> list) {
        return list.stream().filter(s->s.toLowerCase().contains("o")).toList();
    }
}
