package com.company;

import java.util.TreeSet;

public class Restaurant extends Building {
    private TreeSet<Employee> employeesList;
    private Menu menu;

    public Restaurant(int roomsNumber, int bathroomNumber, boolean kitchen) {
        super(roomsNumber, bathroomNumber, kitchen);
        employeesList = new TreeSet<Employee>();
        menu = new Menu();
    }

    public Employee getEmployee(String employeeName) {
        Employee employee = null;
        for (Employee setItem : employeesList) {
            if (setItem.getFullName().equals(employeeName)) {
                employee = setItem;
            }
        }
        return employee;
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
        System.out.println(employee.getFullName() + " was added to Employee list.");
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.addMenuItem(menuItem);
    }

    public void printMenu() {
        menu.printMenu();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void printBuildingStatus() {
        super.printAllValues();
    }

    public void printEmployeesList() {
        System.out.println("*** Employees List ***");
        for (Employee employee : employeesList) {
            employee.printAllValues();
        }
        System.out.println("*** End of employees list ***");
    }
}
