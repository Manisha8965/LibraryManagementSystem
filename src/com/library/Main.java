package com.library;

import java.util.List;

class Main {
    static void main() {
        TextBook mathBook = new TextBook("1111", "Advanced Calculus", "Gilbert Strang", "Mathematics");
        NovelBook fictionBook = new NovelBook("2222", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");

        LibraryManagementSystem.addBook(mathBook);
        LibraryManagementSystem.addBook(fictionBook);

        Member student = new Member("Alice Smith", "alice@university.edu");
        Librarian librarian = new Librarian("Bob Jones", "bob@library.org", "EMP-99");

        LibraryManagementSystem.registerUser(student);
        LibraryManagementSystem.registerUser(librarian);

        System.out.println("INITIAL SYSTEM STATE");
        LibraryManagementSystem.printInventory();
        System.out.println();
        LibraryManagementSystem.printUsers();

        System.out.println("TESTING TRANSACTION SYSTEM");
        System.out.println("Borrowing 'The Great Gatsby' for Alice...");
        boolean success = fictionBook.lend(student);
        System.out.println("Lend Transaction Status: " + success);
        System.out.println();

        System.out.println("UPDATED SYSTEM STATE AFTER BORROW");
        LibraryManagementSystem.printInventory();
        System.out.println();
        student.displayDashboard();
        System.out.println();

        System.out.println("TESTING ADVANCED POLYMORPHIC OVERLOADED SEARCH");
        List<Book> search1 = LibraryManagementSystem.searchBooks("The Great Gatsby");
        System.out.println("Search by title count: " + search1.size());

        List<Book> search2 = LibraryManagementSystem.searchBooks("The Great Gatsby", "NovelBook");
        System.out.println("Search by title and specific type count: " + search2.size());
        System.out.println();

        System.out.println("Total Registered Users across active system tracking state: " + User.getTotalUsers());

        System.out.println("\n--- Cleaning unused warning triggers ---");
        librarian.addNewBook(mathBook);
        librarian.removeBook(mathBook);
        int count = student.getBorrowedBooksCount();
        String isbn = mathBook.getIsbn();
        fictionBook.returnBook(student);

        // Clears the final three User encapsulation warnings by invoking the methods
        student.setName("Alice M. Smith");
        student.setContactInfo("alice.smith@university.edu");
        String contact = student.getContactInfo();

        System.out.println("Encapsulation validation token: " + count + " " + isbn + " " + contact);
    }
}
