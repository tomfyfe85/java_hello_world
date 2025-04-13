package com.codewithmosh;

public class Calculate {
    private int principle;
    private short numberOfPayments;
    private float monthlyInterest;


    public Calculate(int principle, float annualInterest, byte years){
        var generate = new Generator(years, annualInterest);

        this.principle = principle;
        this.monthlyInterest = generate.monthlyInterestGenerator();
        this.numberOfPayments = generate.numberOfPaymentsGenerator();

    }

    private double calculateMortgage() {

        double numerator = (Math.pow((1 + monthlyInterest), numberOfPayments)) * monthlyInterest;
        double denominator = (Math.pow((1 + monthlyInterest), numberOfPayments)) - 1;

        return (numerator / denominator) * principle;
    }

    private static double calculateBalance(
            int principle,
            float monthlyInterest,
            short noOfPayments,
            int noOfPaymentsMade) {

        double numerator = principle * (Math.pow((1 + monthlyInterest), noOfPayments) - Math.pow((1 + monthlyInterest), noOfPaymentsMade));
        double denominator = Math.pow((1 + monthlyInterest), noOfPayments) - 1;

        return numerator / denominator;
    }
}


