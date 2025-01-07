package com.codewithmosh;


import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        String percentage = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentage);
    }
}