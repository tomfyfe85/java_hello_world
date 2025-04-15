package com.mortgagecalculator;

public class Calculator {
    private int principle;
    private short numberOfPayments;
    private float monthlyInterest;
    private int numberOfPaymentsMade;


    public Calculator(int principle, float annualInterest, byte years, int numberOfPaymentsMade){
        var generate = new Generator(years, annualInterest);

        this.principle = principle;
        this.monthlyInterest = generate.monthlyInterestGenerator();
        this.numberOfPayments = generate.numberOfPaymentsGenerator();
        this.numberOfPaymentsMade = numberOfPaymentsMade;

    }

    public double calculateMortgage() {

        double numerator = (Math.pow((1 + monthlyInterest), numberOfPayments)) * monthlyInterest;
        double denominator = (Math.pow((1 + monthlyInterest), numberOfPayments)) - 1;

        return (numerator / denominator) * principle;
    }

    public double calculateBalance() {
        double numerator = this.principle * (Math.pow((1 + this.monthlyInterest), this.numberOfPayments) - Math.pow((1 + monthlyInterest), this.numberOfPaymentsMade));
        double denominator = Math.pow((1 + monthlyInterest), this.numberOfPayments) - 1;

        return numerator / denominator;
    }
}


