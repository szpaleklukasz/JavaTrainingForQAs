package com.company;

public class Building {
    private int roomsNumber;
    private int bathroomNumber;
    private boolean kitchen;

    public Building(int roomsNumber, int bathroomNumber, boolean kitchen) {
        this.roomsNumber = roomsNumber;
        this.bathroomNumber = bathroomNumber;
        this.kitchen = kitchen;
    }

    public void printAllValues() {
        String hasKitchen = "";
        if (!kitchen) hasKitchen = "no ";
        System.out.println("*** Building status ***");
        System.out.println("Building has " + roomsNumber + " room(s) and " + hasKitchen + "kitchen. Also with " + bathroomNumber + " bathroom(s).");
        System.out.println("*** End of building status ***");
    }
}
