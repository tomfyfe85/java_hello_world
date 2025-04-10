package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
//        var employee = new Employee(50_000, 20);
//        int wage = employee.calculateWage();
//
//        System.out.println(wage);
          var mortgageCalcualtor = new MortgageCalculator();
          float annualInt = mortgageCalcualtor.monthlyInterestGenerator();
          System.out.println(annualInt);
    }
}