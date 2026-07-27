package com.library;

public class TextBook extends Book {
    private final String subject;

    public TextBook(String isbn, String title, String author, String subject) {
        super(isbn, title, author);
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Type: TextBook | Title: " + getTitle() + " | Author: " + getAuthor() + " | Subject: " + subject + " | Available: " + isAvailable());
    }
}
