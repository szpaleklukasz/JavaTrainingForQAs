package com.company;

public class Employee implements Comparable<Employee> {
    private String fullName;
    private String position;
    private int salaryPerHour;

    public Employee(String name, String surname, String position, int salaryPerHour) {
        this.fullName = name + " " + surname;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPosition() {
        return this.position;
    }

    public int getSalaryPerHour() {
        return this.salaryPerHour;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void printAllValues() {
        System.out.println(fullName + " is working as a " + position + " with salary per hour: " + salaryPerHour + " PLN");
    }

    @Override
    public int compareTo(Employee e) {
        return this.getFullName().compareTo(e.getFullName());
    }
}
