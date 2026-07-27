package com.library;

public class Member extends User {
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    public Member(Member otherMember) {
        super(otherMember);
        this.borrowedBooksCount = otherMember.borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void incrementBorrowedCount() {
        borrowedBooksCount++;
    }

    public void decrementBorrowedCount() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        }
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== MEMBER DASHBOARD ===");
        System.out.println("ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Books Borrowed: " + borrowedBooksCount);
        System.out.println("========================");
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
