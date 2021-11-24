package com.company;

public class MenuItem {
    private String itemName;
    private String itemDescription;
    private int itemPrice;

    public MenuItem(String itemName, String itemDescription, int itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }
}
