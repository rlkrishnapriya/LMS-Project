package com.library;

public abstract class LibraryItem {
    private String title;
    private String itemCode;
    private boolean isAvailable = true;

    public LibraryItem(String title, String itemCode) {
        this.title = title;
        this.itemCode = itemCode;
    }

    public String getTitle() {
        return title;
    }

    public String getItemCode() {
        return itemCode;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public abstract double calculateLateFee(int daysLate);

    public abstract boolean canBeRenewed();
}
