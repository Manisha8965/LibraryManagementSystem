package com.library;

/*
 * NovelBook is a concrete subclass that inherits all data fields and tracking rules from the parent Book class.
 */
public class NovelBook extends Book {
    private String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Type: NovelBook | Title: " + getTitle() + " | Author: " + getAuthor() + " | Genre: " + genre + " | Available: " + isAvailable());
    }
}
