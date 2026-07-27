package com.library;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian() {
        super();
        this.employeeNumber = "Not Assigned";
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public Librarian(Librarian otherLibrarian) {
        super(otherLibrarian);
        this.employeeNumber = otherLibrarian.employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== LIBRARIAN DASHBOARD ===");
        System.out.println("ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("===========================");
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
