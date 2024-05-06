package org.example;

public class ifStatements {
    public static void main(String[] args) {


        int x = 10;

        if (x < 10) {

            System.out.println("x is less than 10");


        } else if (x < 20) {
            System.out.println("x is less than 20.");
        }


        if (x < 10) {

            System.out.println("x is less than 10");


        } if (x < 20) {
            System.out.println("x is less than 20.");
        };


        //These are independent if statements so both of them will run,
        //the else if is connected to the previous if
        boolean s = x<10;
        System.out.println(s);

    }
}
