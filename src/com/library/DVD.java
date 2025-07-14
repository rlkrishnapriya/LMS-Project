package com.library;

public class DVD extends LibraryItem {
    private String director;
    private int runTime;

    public DVD(String title, String itemCode, String director, int runTime) {
        super(title, itemCode);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector() {
        return director;
    }
    
    public int getRunTime() {
        return runTime;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1.5;
    }

    @Override
    public boolean canBeRenewed() {
        return true;
    }
}
