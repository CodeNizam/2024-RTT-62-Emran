package org.example;

import java.text.DecimalFormat;

public class CoreJavaBasics {
    public static void main(String args[]) {

        //Question #1
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println(sum);

        //Question #2
        double dub1 = 12.5;
        double dub2 = 17.5;
        double sumDub = dub1 + dub2;
        System.out.println(sumDub);

        //Question #3
        int num3 = 3;
        double dub3 = 2.5;
        double sumIntDub = num3 + dub3;
        System.out.println(sumIntDub);

        //Question #4
        int num4 = 5;
        int num5 = 10;
        int divide = num5 / num4;
        System.out.println(divide);

        double num6 = 12.5;
        double divideDecimal = num6 / num4;
        System.out.println(divideDecimal);

        //Question #5
        double dub4 = 12.5;
        double dub5 = 26.00;
        double sumDub2 = dub5 / dub4;
        System.out.println(sumDub2);

        int sumDub2Int = (int) sumDub2;
        System.out.println(sumDub2Int);

        //Question #6

        int x = 5;
        double y = 6;
        double q = y / x;
        System.out.println(q);


        //Question #7
        final int ALL_CAPS = 4;
        final double VERY_LOUD = 6.3;
        double sumAllCaps = ALL_CAPS + VERY_LOUD;
        System.out.println(sumAllCaps);

        //Question #8


        double coffee = 2.50;
        double tea = 3.50;
        double espresso = 4.50;

        double subtotal = (coffee * 3) + (tea * 4) + (espresso * 2);
        double totalSale = subtotal;

        final double SALES_TAX = 0.09;

        double salesTaxAmount = subtotal * SALES_TAX;
        double totalAmount = subtotal + salesTaxAmount;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Subtotal: " + df.format(subtotal));
        System.out.println("Sales Tax: " + df.format(salesTaxAmount));
        System.out.println("Total Sale: " + df.format(totalAmount));


    }
}
