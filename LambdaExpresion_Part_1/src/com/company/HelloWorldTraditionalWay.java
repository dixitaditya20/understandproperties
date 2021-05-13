package com.company;

public class HelloWorldTraditionalWay implements HelloWorldInterface {
    @Override
    public String sayHelloWorld() {
        return "Hello World Traditional Way";
    }

    public static void main(String[] args) {
        HelloWorldTraditionalWay hwt = new HelloWorldTraditionalWay();

        // Traditional Way to Call a Interface
        System.out.println(hwt.sayHelloWorld());
    }
}