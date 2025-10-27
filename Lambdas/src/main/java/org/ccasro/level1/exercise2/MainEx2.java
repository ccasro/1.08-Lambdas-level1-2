package org.ccasro.level1.exercise2;

import java.util.List;

public class MainEx2 {
    public static void main(String[] args){
        List<String> stringList = List.of("Hello","Flower","example","Clear","Avoid","Important","Seal","Soul","Orbital");

        System.out.println(listWithO(stringList));
    }

    private static List<String> listWithO(List<String> list) {
        return list.stream().filter(s->s.toLowerCase().contains("o")).filter(s->s.length() > 5).toList();
    }
}
