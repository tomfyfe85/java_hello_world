package com.mortgagecalculator;

import java.text.NumberFormat;

public class Printer {

    private final int numberOfPaymentsToPay;
    private final int principle;
    private final float AnnualInterest;
    private final byte years;
    private final double mortgageRate;
    private double balance;
    private static int numberOfPaymentsMade = 1;

    public Printer(int principle, float AnnualInterest, byte years ){
        this.principle = principle;
        this.AnnualInterest = AnnualInterest;
        this.years = years;
        this.numberOfPaymentsToPay = years * 12;

        var mortgageRate = new Calculator(principle, AnnualInterest, years, numberOfPaymentsMade);
        this.mortgageRate = mortgageRate.calculateMortgage();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (int i = numberOfPaymentsMade; i <= this.numberOfPaymentsToPay; i++) {
            var calculate = new Calculator(principle, AnnualInterest, years, numberOfPaymentsMade);
            balance = calculate.calculateBalance();
            numberOfPaymentsMade++;

            String totalRemaining = NumberFormat.getCurrencyInstance().format(balance);

            System.out.println(totalRemaining);
        }
    }
        public void printMortgage() {
            String formattedMortgage = NumberFormat.getCurrencyInstance().format(this.mortgageRate);
            System.out.println();
            System.out.println("MORTGAGE");
            System.out.println("--------");
            System.out.println("Monthly Payments: " + formattedMortgage);}
    }
