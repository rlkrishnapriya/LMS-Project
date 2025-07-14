package com.library;

public class Book extends LibraryItem {
    private String author;
    private String isbnCode;

    public Book(String title, String itemCode, String author, String isbnCode) {
        super(title, itemCode);
        this.author = author;
        this.isbnCode = isbnCode;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getIsbnCode() {
        return isbnCode;
    }   
    
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2.0;
    }

    @Override
    public boolean canBeRenewed() {
        return true;
    }
}
