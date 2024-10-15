package com.codewithmosh;

import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
       String[] fruits = { "apple", "mango", "orange" };

       for (int i = 0; i < fruits.length; i++)
           System.out.println(fruits[i]);

       for (String fruit : fruits)
           System.out.println(fruit);
    }
}

