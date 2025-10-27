package org.ccasro.level1.exercise4;

import java.util.List;

public class MainEx4 {

    public static void main(String[] args){
        List<String> stringList = List.of("January","February","March","April","May","June","July","August","September","October","November","December");

        System.out.println("With method reference: ");
        stringList.forEach(System.out::println);
    }

}
