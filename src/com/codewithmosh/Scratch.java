package com.codewithmosh;

//import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
        String msg = greetUser("Tom", "Fyfe");
        System.out.println(msg);
    }
    public static String greetUser(String firstName, String lastName){
        return "hello " + firstName + " " + lastName;
    }
}
