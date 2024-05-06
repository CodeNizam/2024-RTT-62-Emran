package May_4_Weekend_Homework.PA_303_4_1_Control_Flow;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        //Question #1
        int x = 15;

        if (x < 10) {

            System.out.println("Less than 10");
        }


        //Question#2
        int x2 = 7;

        if (x2 < 10) {

            System.out.println("Less than 10");

        } else if (x2 > 10) {
            System.out.println("Greater than 10");
        }


        //Question #3
        int x3 = 50;
        if (x3 < 10) {

            System.out.println("Less than 10");

        } else if (x3 >= 10 && x3 < 20) {
            System.out.println("10 and 20");
        } else {
            System.out.println(">=20");


        }


        //Question #4

        int x4 = 5;


        if (x4 >= 10 && x4 <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }


        //Question #5
        Scanner scoreScanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = scoreScanner.nextInt();


        if (score < 0 || score > 100) {
            System.out.println("Out of range");
        } else if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


//        scoreScanner.close();


        //Question #6
        Scanner weekdayScanner = new Scanner(System.in);


        System.out.print("Enter number between 1 and 7: ");
        int weekdayNumber = weekdayScanner.nextInt();

        switch (weekdayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }

        weekdayScanner.close();



        //Question #7

        //...too long
    }
}
