package com.library;

/*
 * Task 1, 2, 3 & 6: Base User Abstract Class
 * Encapsulation: Keeping fields private and regulating access through explicit getters/setters.
 * Abstract Class: Cannot be instantiated directly; serves as a template to enforce common design.
 */
public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;

    // Step 6.1: Static variable maintains a single state shared globally across all user instances
    private static int totalUsers = 0;

    // Step 2.1: Default Constructor
    public User() {
        this.userId = generateUniqueId();
        this.name = "Unknown";
        this.contactInfo = "Not Provided";
    }

    // Step 2.1: Parameterized Constructor
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Step 2.1: Copy Constructor
    public User(User otherUser) {
        this.userId = generateUniqueId();
        this.name = otherUser.name;
        this.contactInfo = otherUser.contactInfo;
    }

    // Step 6.2: Final method prevents child subclasses from overriding the ID generation rules
    public final String generateUniqueId() {
        totalUsers++;
        return "USR-" + String.format("%04d", totalUsers);
    }

    // Step 6.1: Static getter method to access global counter from anywhere safely
    public static int getTotalUsers() {
        return totalUsers;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Step 3.1 & 3.2: Abstract methods declared without a body.
    // This enables runtime polymorphism, forcing concrete sub-types to implement their own variations.
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
