package Homework_May_2_2024.PA_303_2_3;

public class Operators {
    public static void main(String[] args) {

        //Question #1
        Integer x = 9;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;


        System.out.println(Integer.toBinaryString(x));
        x = 17;
        x = x << 1;


        System.out.println(Integer.toBinaryString(x));
        x = 88;
        x = x << 1;


        //Question #2
        x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;


        x = 225;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;


        x = 1555;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;


        x = 32456;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;


//Question #3
        x = 7;
        Integer y = 17;
        Integer z = x & y;
        System.out.println(z);


        //Question #4
        z = x | y;
        System.out.println(z);


        //Question #5
        int postfixIncrement = 5;
        System.out.println(postfixIncrement);
        postfixIncrement++;
        System.out.println(postfixIncrement);

        //Question #6
        int increment = 2;
        System.out.println(increment);
        increment++;
        System.out.println(increment);
        ++increment;
        System.out.println(increment);
        increment += 1;
        System.out.println(increment);

        //Question #7
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println(sum);

        x = 5;
        y = 8;
        int sum2 = x++ + y;
        System.out.println(sum2);

    }

}
