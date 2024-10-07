package com.codewithmosh;

//Project - Mortgage calculator
//when you run program =>

//Principal: (amount of loan I want to get eg 100000)
//Annual interest rate: (IE %3.92) = actual interest is .0392 as it was represented as a % -
//-so what every the user enters, divide by 100 then 12
//Period (years): (eg 30 years) = multiply by 12 to get number of monthly payments
//=>
//Mortgage: $472.81

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
    // prompt user to enter loan amount
        System.out.println("Enter loan amount in GBP");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Enter annual interest rate");


        NumberFormat amount  = NumberFormat.getCurrencyInstance();
        String result = amount.format(num);
        System.out.println(result);
        //        Int mortgage = amount.nextInt();
        //        System.out.println(mortgage);

    }
}