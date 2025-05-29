package com.codewithmosh;

public class TextBox extends UIControl {
    private String text = ""; // field

//    public TextBox() {
//        super(true);
//    }

    //    }


    //    }
    @Override
    public void render() {
        System.out.println("render TextBox");
    }

    @Override
    public String toString(){
       return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
