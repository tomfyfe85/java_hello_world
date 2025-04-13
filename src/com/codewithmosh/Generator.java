package com.codewithmosh;

public class Generator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private byte  years;
    private float annualInterest;

    Generator(byte years, float annualInterest){
        this.years = years;
        this.annualInterest = annualInterest;
    }

    private short numberOfPaymentsGenerator() {

        return (short) (this.years * MONTHS_IN_YEAR);
    }

    private float monthlyInterestGenerator(){

        return this.annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

}
