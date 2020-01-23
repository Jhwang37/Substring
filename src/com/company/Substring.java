package com.company;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println("Enter a number as an index: ");
        int index = scan.nextInt();

        System.out.println("Length of  your word: " + word.length());
        System.out.println("The substring from 0 to " + index +
                " is: " + word.substring(0, index));
    }
}
