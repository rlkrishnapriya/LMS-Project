package com.library;

public class Magazine extends LibraryItem {
    private String author;
    private String issueNumber;

    public Magazine(String title, String itemCode, String author, String issueNumber) {
        super(title, itemCode);
        this.author = author;
        this.issueNumber = issueNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssueNumber() {
        return issueNumber;
    }
    
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.0;
    }

    @Override
    public boolean canBeRenewed() {
        return false;
    }
}
