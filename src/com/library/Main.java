package com.library;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing User Structure Milestone ---");
        System.out.println();

        Member member1 = new Member("Alice Smith", "alice@university.edu");
        Librarian lib1 = new Librarian("Bob Jones", "bob@library.org", "EMP-99");
        Member member2 = new Member(member1);

        member1.displayDashboard();
        System.out.println();
        lib1.displayDashboard();
        System.out.println();

        System.out.println("--- Testing Tracking & Encapsulation ---");
        System.out.println("Member 1 Generated ID: " + member1.getUserId());
        System.out.println("Librarian Generated ID: " + lib1.getUserId());
        System.out.println("Copied Member 2 Generated ID: " + member2.getUserId());
        System.out.println();

        System.out.println("Total Registered Users tracked in system: " + User.getTotalUsers());
    }
}
