package org.ccasro.level1.exercise8;

public class MainEx8 {

    public static void main(String[] args){
        Reverse reverser = s -> new StringBuilder(s).reverse().toString();

        System.out.println(reverser.reverse("Hello world!"));
    }
}
