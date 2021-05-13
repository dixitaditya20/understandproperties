package com.company;

public class HelloWorldModernWay_Lambda_Expression {

    public static void main(String[] args) {
        HelloWorldInterface hwi =() -> {
            return "Hello World Modern Way";
        };

        System.out.println(hwi.sayHelloWorld());
    }
}
