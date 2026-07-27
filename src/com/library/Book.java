package com.library;

public abstract class Book implements Lendable {
    private final String isbn;
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            if (user instanceof Member) {
                ((Member) user).incrementBorrowedCount();
            }
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        if (user instanceof Member) {
            ((Member) user).decrementBorrowedCount();
        }
    }

    public abstract void displayBookDetails();
}
