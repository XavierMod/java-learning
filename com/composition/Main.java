package com.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1140));
        Motherboard motherboard = new Motherboard("CSD", "Dell", 4, 3, "10");

        PC pc = new PC(theCase, monitor, motherboard);
        System.out.println(monitor.getModel());
    }
}
