//  A program to remove all occurrences of 'T' or 't'.

package com.tgt.igniteplus;

import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence. ");
        String string = in.nextLine();
        System.out.println("Removing occurrences of 'T' and 't' in the sentence.....");
        StringBuilder Result_String = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'T' || c == 't')
                continue;
            Result_String.append(c);
        }

        System.out.println("The sentence after removing 'T' and 't' is : ");
        System.out.println(Result_String);
        in.close();
    }

}
/*OUTPUT
Enter a sentence.
To test this string.
Removing occurrences of 'T' and 't' in the sentence.....
The sentence after removing 'T' and 't' is :
o es his sring.
 */
