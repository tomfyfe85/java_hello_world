package com.codewithmosh;
import java.util.Scanner;


public class MortgageCalculator {


    private int principle = (int) readNumber("Principle: ", 1000, 1_000_000);
    private float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    private byte years = (byte) readNumber("Period (years): ", 1, 30);


    public void printMortgageAndBalance(){
        var print = new Printer(principle, annualInterest, years);
        print.printMortgage();
        print.printPaymentSchedule();
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












