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

//pt 2
// adding error handling
// Principle (£1k - £1M) - Principle must be in this range -
// Principle (£1k - £1M) will loop until an amount in this range is given

//Annual interest rate: - user must enter a value greater than 0 and less than 30
//... otherwise an error message will show and the user can try again

//Period (Years): - user must enter a value greater than 1 and less than 30
//... otherwise an error message will show and the user can try again

// if all of the above is satisfied the mortgage will be calculated


import java.text.NumberFormat;
import java.util.Scanner;
//Mortgage: => money owed each month
public class MortgageCalculator {
    public static void main(String[] args) {
        byte PERCENT = 100;
        byte MONTHS_IN_YEAR = 12;
        float r = 0;
        byte years = 0;
        int numberOfPayments = 0;
        float principle = 0;

    // prompt user to enter loan amount
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter loan amount in GBP");
            principle = scanner.nextFloat();
            if(principle >= 1000.00 && principle <= 1000000.00)
                break;
            System.out.println("Enter an amount between 1k and 1m");
        }

    // prompt user for interest rates
        while (true){
            System.out.println("Enter annual interest percentage rate");
            float percentage = scanner.nextFloat();
            if (percentage >= 1 && percentage <= 30){
                r =  percentage / PERCENT / MONTHS_IN_YEAR;
                break;}
            System.out.println("enter interest more than 0 and less than or equal to 30");

        }


        while (true){
            System.out.println("Enter period (Years)");
            years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("enter no. of years between 1 and 30");
        }

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

//REVISION

