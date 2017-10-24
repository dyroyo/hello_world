package edu.pcc.cis.helloworld;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        printGreeting();
        printDate();
    }

    private static void printGreeting()
    {
       String greeting = "Hello World! This is my first repository!";
       System.out.println(greeting);
    }

    private static void printDate()
    {
        System.out.println(new Date());
    }
}
