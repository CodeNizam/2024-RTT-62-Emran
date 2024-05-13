package org.example;

public class SBA1Practice {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function

        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */


        for (int pos = 0; pos < s.length(); pos++) {
            System.out.println(s.charAt(pos));
        }



        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        int ten1 = Integer.parseInt(ten);
        int hundred1 = Integer.parseInt(hundred);


        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }

        System.out.println(sum);



        // part 4
        // given the array of string covert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};

        int sum1 = 0;
        for (String string : nums) {
            int value = Integer.valueOf(string);
            sum1 = sum1 + value;


        }

        System.out.println(sum1);
    }


}