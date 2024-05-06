package May_4_Weekend_Homework.GLAB_303_5_1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");

            int sum = 0;
            int m = 1000;
            // for loop
            for (int q = 1; q <= m; ++q) {
                // body inside for loop
                sum += q;     // sum = sum + i
            }
            System.out.println("Sum = " + sum);



            String original, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string/number to check if it is a palindrome");
            original = in.nextLine();
            int length = original.length();
            for ( int w = length - 1; w >= 0; w-- )
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse)) {
                System.out.println("Entered string/number is a palindrome.");
            }else
            {
                System.out.println("Entered string/number isn't a palindrome.");
            }



            for(int e=1;e<=5;e++){
                for(int j=1;j<=e;j++){
                    System.out.print("* ");
                }
                System.out.println();//new line
            }




        }
    }


}
