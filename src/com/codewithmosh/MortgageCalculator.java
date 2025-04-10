package com.codewithmosh;
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;


public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    int principle = (int) readNumber("Principle: ", 1000, 1_000_000);
    float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    byte years = (byte) readNumber("Period (years): ", 1, 30);

//    public MortgageCalculator(){
//        this.principle = principle;
//        this.annualInterest = annualInterest;
//        this.years = years;
//    }
//    public static void main(String[] args) {
//
//        int principle = (int) readNumber("Principle: ", 1000, 1_000_000);
//        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) readNumber("Period (years): ", 1, 30);
//
//        short numberOfPayments = numberOfPaymentsGenerator(years);
//        float monthlyInterest = monthlyInterestGenerator(annualInterest);
//
//        printMortgage(principle, monthlyInterest, numberOfPayments);
//        printPaymentSchedule(numberOfPayments, principle, monthlyInterest);
//    }

    private static void printMortgage(int principle, float monthlyInterest, short numberOfPayments) {
        double mortgage = calculateMortgage(principle, monthlyInterest, numberOfPayments);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + formattedMortgage);
    }

    private static void printPaymentSchedule(short numberOfPayments, int principle, float monthlyInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (int month = 1; month <= numberOfPayments; month++) {
            double leftToPay = calculateBalance(principle, monthlyInterest, numberOfPayments, month);
            String totalRemaining = NumberFormat.getCurrencyInstance().format(leftToPay);

            System.out.println(totalRemaining);
        }
    }

    public static double readNumber(String prompt, double min, double max) {

        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "and " + max);
        }

        return value;
    }

    public static double calculateMortgage(
            int principle,
            float monthlyInterest,
            short numberOfPayments) {

        double numerator = (Math.pow((1 + monthlyInterest), numberOfPayments)) * monthlyInterest;
        double denominator = (Math.pow((1 + monthlyInterest), numberOfPayments)) - 1;

        return (numerator / denominator) * principle;
    }

    public static double calculateBalance(
            int principle,
            float monthlyInterest,
            short noOfPayments,
            int noOfPaymentsMade) {

        double numerator = principle * (Math.pow((1 + monthlyInterest), noOfPayments) - Math.pow((1 + monthlyInterest), noOfPaymentsMade));
        double denominator = Math.pow((1 + monthlyInterest), noOfPayments) - 1;

        return numerator / denominator;
    }

    public static short numberOfPaymentsGenerator(byte years) {

        return (short) (years * MONTHS_IN_YEAR);
    }

    public static float monthlyInterestGenerator(float annualInterest){

        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}















