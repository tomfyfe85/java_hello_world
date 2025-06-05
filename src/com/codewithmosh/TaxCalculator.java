package com.codewithmosh;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double calcualteTax() {
        return taxableIncome * 0.3;
    }
}

