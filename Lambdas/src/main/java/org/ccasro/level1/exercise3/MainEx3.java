package org.ccasro.level1.exercise3;

import java.util.List;

public class MainEx3 {
    public static void main(String[] args){
        List<String> stringList = List.of("January","February","March","April","May","June","July","August","September","October","November","December");

        System.out.println("With lambda expression: ");
        stringList.forEach(s->System.out.println(s));

    }


}
