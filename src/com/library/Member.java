package com.library;

/*
 * Task 4: Concrete Subclass Member
 * Inherits all common data from User and introduces specific attributes like limits and track counters.
 */
public class Member extends User {
    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    // Step 4.4: Default Constructor chaining to super
    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    // Step 4.4: Parameterized Constructor passing core details to parent
    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    // Step 4.4: Copy Constructor
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

    // Step 4.3: Runtime Polymorphic Overriding of display layout
    @Override
    public void displayDashboard() {
        System.out.println("=== MEMBER DASHBOARD ===");
        System.out.println("ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("Books Borrowed: " + borrowedBooksCount);
        System.out.println("========================");
    }

    // Step 4.3: Evaluate dynamic state limits to determine borrowing qualification
    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
