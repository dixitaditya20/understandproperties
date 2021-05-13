package com.company;

public class ConcatenateString_Traditional_Way implements Concatenate{
    @Override
    public String sConcatenate(String a, String b) {
        return a  + " " + b;
    }

    public static void main(String[] args) {
        ConcatenateString_Traditional_Way ctw = new ConcatenateString_Traditional_Way();
        System.out.println(ctw.sConcatenate( "Hello World", "in Traditional Way"));
    }
}
