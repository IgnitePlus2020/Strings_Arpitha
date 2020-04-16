//   A program to check if a string is empty.

package com.tgt.igniteplus;

import java.util.Scanner;

public class CheckEmptyString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string. ");
        String string = in.next();
        //Checking if string is empty.
        if(string.isEmpty())
            System.out.println("String is empty.");
        else
            System.out.println("String is not empty");
        in.close();

    }
}
/*OUTPUT
Enter a string.
Hello
String is not empty
 */
/*OUTPUT
Enter a string.

String is empty.
 */