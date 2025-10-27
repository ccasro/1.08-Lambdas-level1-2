package org.ccasro.level2.exercise1;

import java.util.List;

public class MainEx1 {
    public static void main(String[] args){
        List<String> nameList = List.of("Cesar","Carlos","Eva","Roberto","Rigoberto","Oscar","Ernesto","Angel","Elena","Ana","ali","Ava");

        List<String> result = stringFilter(nameList);

        if(result.isEmpty()) {
            System.out.println("No matches were found");
        } else {
            result.forEach(System.out::println);
        }
    }

    private static List<String> stringFilter(List<String> nL){
        return nL.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("A")).toList();
    }
}
