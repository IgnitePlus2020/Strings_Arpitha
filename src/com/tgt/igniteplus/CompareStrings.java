//  A program to show different ways to compare strings and check if it is equal.

package com.tgt.igniteplus;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings for comparing. ");
        String string1 = in.next();
        String string2 = in.next();

        //comparing strings using compareTo()
        //compareTo() returns 0 if both strings are equal.

        System.out.println("------------------------------------------------------");
        System.out.println("Comparing string1 and string2 using compareTo()");
        int result = string1.compareTo(string2);
        if ( result == 0) {
            System.out.println("Strings are equal ");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println("------------------------------------------------------");

        //checking two strings using equals()
        //equals() returns true if strings are equal else returns false.
        System.out.println("Comparing string1 and string2 using equals()");
        if (string1.equals(string2))
            System.out.println("Strings are equal ");
        else
            System.out.println("Strings are not equal");

        System.out.println("------------------------------------------------------");

        //Checking if two strings are equal using ==
        //returns false if address is different of the strings,even though the strings are has equal value.
        System.out.println("Comparing string1 and string2 using ==");
        if (string1 == string2)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        System.out.println("------------------------------------------------------");

        System.out.println("Creating a string3 by assigning it string1");
        String string3 = string1;
        System.out.println("Comparing string1 and string3 using ==");
        if (string1 == string3)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        System.out.println("------------------------------------------------------");

        in.close();

    }
}
/*
OUTPUT
Enter two strings for comparing.
hello
hi
------------------------------------------------------
Comparing string1 and string2 using compareTo()
Strings are not equal
------------------------------------------------------
Comparing string1 and string2 using equals()
Strings are not equal
------------------------------------------------------
Comparing string1 and string2 using ==
Strings are not equal
------------------------------------------------------
Creating a string3 by assigning it string1
Comparing string1 and string3 using ==
Strings are equal
------------------------------------------------------
 */
/*
OUTPUT
Enter two strings for comparing.
Great
Great
------------------------------------------------------
Comparing string1 and string2 using compareTo()
Strings are equal
------------------------------------------------------
Comparing string1 and string2 using equals()
Strings are equal
------------------------------------------------------
Comparing string1 and string2 using ==
Strings are not equal
------------------------------------------------------
Creating a string3 by assigning it string1
Comparing string1 and string3 using ==
Strings are equal
------------------------------------------------------
 */