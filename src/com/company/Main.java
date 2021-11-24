package com.company;

public class Main {

    public static void main(String[] args) {
        // BUILDING
        System.out.println("\n\n****** BUILDING ******");
        Building building = new Building(7, 1, false);
        building.printAllValues();

        //EMPLOYEE
        System.out.println("\n\n****** EMPLOYEE ******");
        Employee employee = new Employee("John", "Doe", "Chef", 34);
        System.out.println(employee.getFullName());
        System.out.println(employee.getPosition());
        System.out.println(employee.getSalaryPerHour());
        employee.setPosition("Waiter");
        employee.setSalaryPerHour(14);
        employee.printAllValues();

        //MENU ITEM
        MenuItem fries = new MenuItem("Fries", "Chopped and fired potatoes.", 12);
        MenuItem cola = new MenuItem("Cola", "Nasty sparkly drink", 44);

        //MENU
        System.out.println("\n\n****** MENU ******");
        Menu menu = new Menu();
        menu.addMenuItem(fries);
        menu.addMenuItem(fries);
        menu.addMenuItem(cola);

        System.out.println(menu.getItemPrice("Fries"));
        menu.printMenu();

        //RESTAURANT
        System.out.println("\n\n****** RESTAURANT ******");
        Restaurant restaurant = new Restaurant(4, 2, true);
        restaurant.addEmployee(employee);
        System.out.println(restaurant.getEmployee("John Doe").getSalaryPerHour());
        restaurant.addMenuItem(cola);
        restaurant.addMenuItem(fries);
        restaurant.printMenu();
        restaurant.printBuildingStatus();
        restaurant.printEmployeesList();
    }
}
