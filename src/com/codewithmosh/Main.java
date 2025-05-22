package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
    var control = new UIControl(true);
    var textBox = new TextBox();
    show(textBox);
    }

    public static void show(UIControl control){
        System.out.println(control);
    }
}