package com.codewithmosh;

public class TextBox extends UIControl {
    private String text = ""; // field

    public TextBox() {
        boolean b = true;
        super(isEnabled:true);
        System.out.println("textBox()");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
