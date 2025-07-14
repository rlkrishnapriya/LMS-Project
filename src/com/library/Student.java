package com.library;

public class Student extends LibraryUser {
    public Student(String name, String userId) {
        super(name, userId);
    }

    @Override
    public int getBorrowLimit() {
        return 3;
    }
}
