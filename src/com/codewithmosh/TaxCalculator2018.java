package com.codewithmosh;

public class TaxCalculator2018 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}

