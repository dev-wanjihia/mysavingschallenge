package com.swc.mysavingschallenge.model;

public class WeeklySaving {
    private int weekNumber;

    private int depositAmount;

    private float totalSavings;

    public WeeklySaving(int weekNumber, int depositAmount, float totalSavings) {
        this.weekNumber = weekNumber;
        this.depositAmount = depositAmount;
        this.totalSavings = totalSavings;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public float getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(float totalSavings) {
        this.totalSavings = totalSavings;
    }
}
