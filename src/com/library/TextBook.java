package com.library;

/*
 * TextBook is a concrete subclass that inherits all data fields and tracking rules from the parent Book class.
 */
public class TextBook extends Book {
    private String subject;

    public TextBook(String isbn, String title, String author, String subject) {
        super(isbn, title, author);
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Type: TextBook | Title: " + getTitle() + " | Author: " + getAuthor() + " | Subject: " + subject + " | Available: " + isAvailable());
    }
}
