package org.ccasro.level1.exercise7;

import java.util.Comparator;
import java.util.List;

public class MainEx7 {
    public static void main(String[] args) {
        List<String> nameList = List.of("Cesar", "Carlos", "Eva", "Roberto", "Rigoberto", "Oscar", "Ernesto", "Angel", "Elena");


        List<String> orderedR = nameList.stream().sorted(Comparator.comparingInt(String::length)).toList().reversed();

        System.out.println(orderedR);
    }
}
