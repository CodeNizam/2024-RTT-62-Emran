package org.example;

import java.util.Scanner;

public class Leapyear {
    public static void main (String [] args){

        Scanner leapscanner = new Scanner(System.in);

        int year = leapscanner.nextInt();

        if ((year % 4 == 0) && (year % 100 >0)) {
            System.out.println("Hi");
        }




    }
}
