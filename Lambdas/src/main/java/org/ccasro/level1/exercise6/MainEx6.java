package org.ccasro.level1.exercise6;

import java.util.Comparator;
import java.util.List;

public class MainEx6 {
    public static void main(String[] args){
        List<String> nameList = List.of("Cesar","Carlos","Eva","Roberto","Rigoberto","Oscar","Ernesto","Angel","Elena");

        List<String> ordered = nameList.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).toList();

        System.out.println(ordered);

        List<String> orderedR = nameList.stream().sorted(Comparator.comparingInt(String::length)).toList();

        System.out.println(orderedR);
    }
}