//  A program to find size or length of a string.

package com.tgt.igniteplus;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string. ");
        String string = in.next();
        //Determining the length of string using length()
        int string_length = string.length();
        System.out.println("Length of the string is : " + string_length);
        in.close();

    }

}
/*OUTPUT
Enter a string.
Hello
Length of the string is : 5
 */
