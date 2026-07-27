package com.library;

import java.util.ArrayList;
import java.util.List;

/*
 * Milestone C Task 1 & 2: Main Application System Collections & Logic
 * Purpose of Collections (Step 1.2): Standard arrays are rigid and have fixed sizes.
 * Using java.util.List (ArrayList) allows dynamic resizing as inventory books and users are added over time.
 */
public class LibraryManagementSystem {
    private static List<Book> bookInventory = new ArrayList<>();
    private static List<User> registeredUsers = new ArrayList<>();

    // Step 1.3: Method to add a book to the dynamic library collection
    public static void addBook(Book book) {
        bookInventory.add(book);
    }

    // Method to remove a book from the library collection
    public static void removeBook(Book book) {
        bookInventory.remove(book);
    }

    // Step 1.3: Method to add a user to the tracking network system
    public static void registerUser(User user) {
        registeredUsers.add(user);
    }

    // Task 2.1: Compile-time polymorphism (Method Overloading Variant 1) - Single Criteria Lookup
    public static List<Book> searchBooks(String criteria) {
        List<Book> results = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)) {
                results.add(book);
            }
        }
        return results;
    }

    // Task 2.2: Compile-time polymorphism (Method Overloading Variant 2) - Dual Criteria Filter with instance validation
    public static List<Book> searchBooks(String criteria, String type) {
        List<Book> baseResults = searchBooks(criteria);
        List<Book> filteredResults = new ArrayList<>();
        for (Book book : baseResults) {
            if (type.equalsIgnoreCase("TextBook") && book instanceof TextBook) {
                filteredResults.add(book);
            } else if (type.equalsIgnoreCase("NovelBook") && book instanceof NovelBook) {
                filteredResults.add(book);
            }
        }
        return filteredResults;
    }

    // Step 1.4: Print routine to output custom text descriptions of all current inventory
    public static void printInventory() {
        System.out.println("--- Library Inventory ---");
        for (Book book : bookInventory) {
            book.displayBookDetails();
        }
    }

    // Step 1.4: Print routine to trace dashboard data configurations for active systems
    public static void printUsers() {
        System.out.println("--- Registered Users ---");
        for (User user : registeredUsers) {
            user.displayDashboard();
            System.out.println();
        }
    }
}
