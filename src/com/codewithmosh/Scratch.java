package com.codewithmosh;

import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0){
            System.out.println("fizzbuzz");}
        else if (num % 5 == 0) {
            System.out.println("fizz");}
        else if (num % 3 == 0) {
            System.out.println("buzz");}
        else
            System.out.println(num);
    }
}

