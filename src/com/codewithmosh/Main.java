package com.codewithmosh;

//Project - Mortgage calculator
//when you run program =>

//Principal: (amount of loan I want to get e.g. 100000)
//Annual interest rate: (IE %3.92) = actual interest is .0392 as it was represented as a % -
//-so what every the user enters, divide by 100 then 12
//Period (years): (e.g. 30 years) = multiply by 12 to get number of monthly payments
//=>
//Mortgage: £472.81

//first 3 are questions. Mortgage should return your monthly payment
// wikihow.com/Calculate-Mortage-Payments
//use Math.pow to raise number power of N where N is no of payments


//Principal: (amount of loan I want to get e.g. 100000)
//Annual interest rate: e.g. %3.45
//Period (years): e.g. 56

import java.text.NumberFormat;
import java.util.Scanner;
//Mortgage: => money owed each month
public class Main {
    public static void main(String[] args) {
        byte PERCENT = 100;
        byte MONTHS_IN_YEAR = 12;

    // prompt user to enter loan amount
        System.out.println("Enter loan amount in GBP");
        Scanner scanner = new Scanner(System.in);
        float principle = scanner.nextFloat();

    // prompt user for interest rates
        System.out.println("Enter annual interest rate");
        float percentage = scanner.nextFloat();
        //  multiply 100, divide by 12
        Float r =  percentage / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Enter period (Years)");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

    /*Equation:
      numerator
        */
        float rPlus1 = (float) (r + 1.0);
        float rPower = (float) Math.pow(rPlus1, numberOfPayments);
        float numerator = r * rPower;

    // denominator
        float denominator =  rPower - (float) 1;

    // num/denom

        float division = numerator/denominator;

    //  mortgage
        float mortgage = principle * division;

    //  convert to currency
        NumberFormat amount  = NumberFormat.getCurrencyInstance();
        String result = amount.format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}

