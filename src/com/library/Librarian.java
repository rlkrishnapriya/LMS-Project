package com.library;

public class Librarian extends LibraryUser {
    public Librarian(String name, String userId) {
        super(name, userId);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    @Override
    public boolean canManageInventory() {
        return true;
    }
}
