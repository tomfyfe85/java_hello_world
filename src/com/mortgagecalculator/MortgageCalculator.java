package com.mortgagecalculator;


public class MortgageCalculator {


    private int principle = (int) Console.readNumber("Principle: ", 1000, 1_000_000);
    private float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
    private byte years = (byte) Console.readNumber("Period (years): ", 1, 30);


    public void printMortgageAndBalance(){
        var print = new Printer(principle, annualInterest, years);
        print.printMortgage();
        print.printPaymentSchedule();
    }

}












