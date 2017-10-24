package edu.pcc.cis.helloworld;
import java.util.Date;

/**
 * @author Dylan Young
 * @version 10.24.2017
 */



public class HelloWorld {
    public static void main(String[] args) {
        printGreeting();
        printDate();
    }

    private static void printGreeting()
    {
       String greeting = "Hello World! This is my first repository!\nCan't wait to get the hang of Git!";
       System.out.println(greeting);
    }

    private static void printDate()
    {
        System.out.println(new Date());
    }
}