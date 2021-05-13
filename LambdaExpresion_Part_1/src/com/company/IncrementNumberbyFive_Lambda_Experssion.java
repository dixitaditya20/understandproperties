package com.company;

public class IncrementNumberbyFive_Lambda_Experssion {
    public static void main(String[] args) {
        Incrementing_Number inm = (x) -> x+5;
        System.out.println(inm.incrementNumberbyfive(2));
    }
}
