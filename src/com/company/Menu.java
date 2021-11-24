package com.company;

import java.util.HashMap;

public class Menu {
    private HashMap<Integer, MenuItem> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        if (menuItems.containsValue(menuItem)) {
            System.out.println("That item already exists on menu.");
        } else {
            menuItems.put(menuItems.size() + 1, menuItem);
            System.out.println(menuItem.getItemName() + " was added into menu on position: " + menuItems.size());
        }
    }

    public int getItemPrice(String itemName) {
        for (MenuItem item : menuItems.values()) {
            if (item.getItemName().equals(itemName)) {
                return item.getItemPrice();
            }
        }
        return 0;
    }

    public void printMenu() {
        System.out.println("*** Restaurant Menu ***");
        for (Integer key : menuItems.keySet()) {
            MenuItem menuItem = menuItems.get(key);
            System.out.println(key + ". " + menuItem.getItemName() + " \"" + menuItem.getItemDescription() + "\" with price: " + menuItem.getItemPrice() + " PLN");
        }
        System.out.println("*** End of restaurant menu ***");
    }
}
