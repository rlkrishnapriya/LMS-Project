package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<LibraryItem> items = new ArrayList<>();
    private List<LibraryUser> users = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addUser(LibraryUser user) {
        users.add(user);
    }

    public void borrowItem(String userId, String title) {
        LibraryUser user = findUserById(userId);
        LibraryItem item = findItemByTitle(title);

        if (user == null || item == null) {
            System.out.println("User or Item not found.");
            return;
        }

        if (!item.isAvailable()) {
            System.out.println("Item is not available.");
            return;
        }

        if (user.hasReachedLimit()) {
            System.out.println("User has reached the borrow limit.");
            return;
        }

        user.borrowItem(item);
        System.out.println("Item borrowed successfully.");
    }

    public void returnItem(String userId, String title, int daysLate) {
        LibraryUser user = findUserById(userId);
        LibraryItem item = findItemByTitle(title);

        if (user == null || item == null) {
            System.out.println("User or Item not found.");
            return;
        }

        user.returnItem(item);
        double fee = item.calculateLateFee(daysLate);
        System.out.println("Item returned. Late fee: ₹" + fee);
    }

    public void searchByTitle(String keyword) {
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + item.getTitle());
            }
        }
    }

    public void showReport() {
        for (LibraryUser user : users) {
            System.out.println(user.getName() + " (" + user.getUserId() + ") has borrowed:");
            for (LibraryItem item : user.getBorrowedItems()) {
                System.out.println(" - " + item.getTitle());
            }
        }
    }

    private LibraryUser findUserById(String userId) {
        for (LibraryUser user : users) {
            if (user.getUserId().equals(userId)) return user;
        }
        return null;
    }

    private LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) return item;
        }
        return null;
    }
}
