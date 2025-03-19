package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        int principle = (int)readNumber("Principle: ", 1000, 1_000_000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (years): ", 1, 30);

        double mortgage = calculateMortgage(principle, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage: "+ formattedMortgage);
    }

     public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true){
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
             float annualInterest,
             byte years) {

         final byte PERCENT = 100;
         final byte MONTHS_IN_YEAR = 12;

         float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
         short numberOfPayments = (short)(years * PERCENT);

         double numerator = (Math.pow((1+monthlyInterest), numberOfPayments)) * monthlyInterest;
         double denominator = (Math.pow((1+monthlyInterest), numberOfPayments)) - 1;
         double mortgage = (numerator/denominator) * principle;

         return mortgage;
     }
}
















