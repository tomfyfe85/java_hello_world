package com.codewithmosh;

import com.mortgagecalculator.Calculator;
import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args){
        var calculator = new TaxCalculator2018(1000_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}
