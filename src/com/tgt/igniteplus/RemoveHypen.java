//A program to remove '-' between digits.

package com.tgt.igniteplus;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class RemoveHypen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence. ");
        String string = in.nextLine();
        int len = string.length();
        StringBuilder result_string = new StringBuilder();
        if(len > 0)
            result_string.append(string.charAt(0));
        for(int i = 1; i < len - 1; i++){
            if (isDigit(string.charAt(i - 1)) && isDigit(string.charAt(i + 1)) && string.charAt(i) == '-') {
                continue;
            }
            result_string.append(string.charAt(i));
        }
        if(len > 1)
            result_string.append(string.charAt(len-1));
        System.out.println("The result_stringultant string is:\n" + result_string);
        in.close();

    }
}
/*OUTPUT
Enter a sentence.
134-10/5566 A-block,Manyata Tech Park
The result_stringultant string is:
13410/5566 A-block,Manyata Tech Park
 */
