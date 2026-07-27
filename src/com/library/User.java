package com.library;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();
        this.name = "Unknown";
        this.contactInfo = "Not Provided";
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User otherUser) {
        this.userId = generateUniqueId();
        this.name = otherUser.name;
        this.contactInfo = otherUser.contactInfo;
    }

    public final String generateUniqueId() {
        totalUsers++;
        return "USR-" + String.format("%04d", totalUsers);
    }

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

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
