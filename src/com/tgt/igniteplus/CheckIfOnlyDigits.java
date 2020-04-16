//  A program to check if string contains only digits.

package com.tgt.igniteplus;

import java.util.Scanner;

public class CheckIfOnlyDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string. ");
        String string = in.next();
        System.out.println("Checking if only digits are present in a string........");
        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                System.out.println("String does not contain only digits.");
                return;
            }

        }
        System.out.println("String contains only digits.");
        in.close();

    }
}
/*
OUTPUT
Enter a string.
123455
Checking if only digits are present in a string........
String contains only digits.
 */
/*
Enter a string.
123Abc
Checking if only digits are present in a string........
String does not contain only digits.
 */
