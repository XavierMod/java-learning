package com.house;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("Rustic", 2, 2, 3);
        Ceiling ceiling = new Ceiling(100, "red");
        Lamp lamp = new Lamp("rustic", true, 3);
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("East");

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
