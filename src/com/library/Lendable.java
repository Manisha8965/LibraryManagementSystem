package com.library;

/*
 * Task 1.1 & 1.2: Lendable Interface
 * Purpose: Interfaces define a strict contract for behavior across unrelated classes.
 * It enables compile-time polymorphism because any class implementing Lendable can
 * be passed or referenced uniformly as a Lendable type during method execution.
 */
public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
