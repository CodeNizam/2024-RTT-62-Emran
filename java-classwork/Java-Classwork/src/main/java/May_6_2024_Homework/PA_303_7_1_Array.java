package May_6_2024_Homework;

import java.util.Arrays;

public class PA_303_7_1_Array {
    public static void main(String[] args) {

        //Question #1
        int[] array1 = new int[3];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);






        //Question #2
        int[] array2 = {13, 5, 7, 68, 2};
        System.out.println(array2[2]);


        //Question #3
        String[] array3 = {"red", "green", "blue", "yellow"};
        System.out.println(array3.length);
        String[] copyArray3 = array3.clone();
        System.out.println(Arrays.toString(copyArray3));



        //Question #4
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println(array4[0]);
        System.out.println(array4[array4.length -1]);
        //System.out.println(array4[array4.length]);

        //Question #5
        int[] array5 = new int[5];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = i;
        }

        //Question #6
        int[] array6 = new int[5];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = i*2;
        }


        //Question #7
        int[] array7 = {1, 2, 3, 4, 5};
        //...



    }


}
