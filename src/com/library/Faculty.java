package com.library;

public class Faculty extends LibraryUser {
    public Faculty(String name, String userId) {
        super(name, userId);
    }

    @Override
    public int getBorrowLimit() {
        return 10;
    }
}
