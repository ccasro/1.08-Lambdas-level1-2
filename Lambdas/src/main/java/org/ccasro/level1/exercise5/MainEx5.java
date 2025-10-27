package org.ccasro.level1.exercise5;

public class MainEx5 {
    @FunctionalInterface
    interface PiValue {
        double getPiValue();
    }

    public static void main(String[] args) {

        double pi = 3.1415;
        PiValue piValue = () -> pi;

        System.out.println(piValue.getPiValue());
    }

}
