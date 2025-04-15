package com.refactoredcalculator;

public class MortageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;

    public MortageCalculator(byte years, float annualInterest, int principal) {
        this.years = years;
        this.annualInterest = annualInterest;
        this.principal = principal;
    }

    public double calculateBalance(short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
