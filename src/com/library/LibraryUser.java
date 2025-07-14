package com.library;

import java.util.ArrayList;
import java.util.List;

public abstract class LibraryUser {
    private String name;
    private String userId;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public LibraryUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
        item.setAvailable(false);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
        item.setAvailable(true);
    }

    public boolean hasReachedLimit() {
        return borrowedItems.size() >= getBorrowLimit();
    }

    public boolean canManageInventory() {
        return false;
    }

    public abstract int getBorrowLimit();
}
