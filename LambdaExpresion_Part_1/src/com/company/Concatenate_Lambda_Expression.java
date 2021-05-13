package com.company;

public class Concatenate_Lambda_Expression {

    public static void main(String[] args) {

        Concatenate cnt  = (a,b) -> a + " " + b;
        System.out.println(cnt.sConcatenate("Hello World ", "in Lambda Expression"));
    }
}
