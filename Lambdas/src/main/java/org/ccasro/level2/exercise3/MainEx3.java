package org.ccasro.level2.exercise3;

public class MainEx3 {
    @FunctionalInterface
    interface Operation {
        float operation();
    }
    public static void main(String[] args){
        float a = 1f,b = 3f;

        Operation add = () -> a + b;
        Operation sub = () -> a - b;
        Operation mul = () -> a * b;
        Operation div = () -> a / b;

        System.out.println("+:  " + add.operation());
        System.out.println("-: " + sub.operation());
        System.out.println("*: " + mul.operation());
        System.out.println("/: " + div.operation());
     }
}
