package com.codewithmosh;
import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;


public class MortgageCalculator {


    private int principle = (int) readNumber("Principle: ", 1000, 1_000_000);
    private float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    private byte years = (byte) readNumber("Period (years): ", 1, 30);

   private short numberOfPayments = numberOfPaymentsGenerator();
   private float monthlyInterest = monthlyInterestGenerator();

    public boolean printMortgageAndShedule(){
        printMortgage();
        printPaymentSchedule();
        return false;
    }

    private void printMortgage() {
        double mortgage = calculateMortgage();
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + formattedMortgage);}

    private void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (int month = 1; month <= numberOfPayments; month++) {
            double leftToPay = calculateBalance(principle, monthlyInterest, numberOfPayments, month);
            String totalRemaining = NumberFormat.getCurrencyInstance().format(leftToPay);

            System.out.println(totalRemaining);
        }
    }

    private static double readNumber(String prompt, double min, double max) {

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




}















