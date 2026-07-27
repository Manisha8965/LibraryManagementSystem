package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static final List<Book> bookInventory = new ArrayList<>();
    private static final List<User> registeredUsers = new ArrayList<>();

    public static void addBook(Book book) {
        bookInventory.add(book);
    }

    public static void removeBook(Book book) {
        bookInventory.remove(book);
    }

    public static void registerUser(User user) {
        registeredUsers.add(user);
    }

    public static List<Book> searchBooks(String criteria) {
        List<Book> results = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)) {
                results.add(results.size(), book);
            }
        }
        return results;
    }

    public static List<Book> searchBooks(String criteria, String type) {
        List<Book> baseResults = searchBooks(criteria);
        List<Book> filteredResults = new ArrayList<>();
        for (Book book : baseResults) {
            if (type.equalsIgnoreCase("TextBook") && book instanceof TextBook) {
                filteredResults.add(filteredResults.size(), book);
            } else if (type.equalsIgnoreCase("NovelBook") && book instanceof NovelBook) {
                filteredResults.add(filteredResults.size(), book);
            }
        }
        return filteredResults;
    }

    public static void printInventory() {
        System.out.println("--- Library Inventory ---");
        for (Book book : bookInventory) {
            book.displayBookDetails();
        }
    }

    public static void printUsers() {
        System.out.println("--- Registered Users ---");
        for (User user : registeredUsers) {
            user.displayDashboard();
            System.out.println();
        }
    }
}
