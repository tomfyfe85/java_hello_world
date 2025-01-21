package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
       String name1 =  greetUser("Tom", "Fyfe");
       String name2 =  greetUser("John", "Spartan");
        System.out.println(name1);
        System.out.println(name2);

    }

    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }

}