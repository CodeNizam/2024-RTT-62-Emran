package org.example;

public class StringExample {
    public static void main (String[] args) {

        String str = "What ever you want to";
        String str2 = new String ("What ever you want");

        System.out.println("length " + str.length());

        String str3 = str.toUpperCase();

        System.out.println(str3);
        System.out.println(str);


        String filename = "document.pdf";
        System.out.println("filename: " + filename);
        System.out.println("period is at index: " + filename.indexOf('.'));
        System.out.println("file extension: " + filename.substring(filename.indexOf('.') +1));
        System.out.println(filename.substring(0, filename.indexOf('.')));

    }
}
