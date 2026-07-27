package com.library;

/*
 * Milestone B Task 2: Abstract Book Class
 * This class is abstract because a generic 'Book' cannot exist on its own;
 * it requires specific categorization variants (like TextBook or NovelBook) to implement exact detail logs.
 */
public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
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

    // Abstract method template to enforce explicit child details printing
    public abstract void displayBookDetails();
}
