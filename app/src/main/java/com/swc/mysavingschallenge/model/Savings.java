package com.swc.mysavingschallenge.model;

public class Savings {
    private int principal;

    private float total;

    public Savings() {
    }

    /**
     * @param principal Initial amount that is going to be saved at the
     * @param total     Total amount that is going to have been saved
     */
    public Savings(int principal, float total) {
        this.principal = principal;
        this.total = total;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
