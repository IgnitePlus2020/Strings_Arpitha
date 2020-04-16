//  A program to prove strings are immutable.

package com.tgt.igniteplus;

public class ProveStringImmutable {
    public static void referenceCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both pointing to the same reference.");

        } else {
            System.out.println("Both are pointing to different reference.");
        }
    }
    public static void main(String[] args) {

        String string1 = "Java";
        String string2 = "Java";
        System.out.println("Before Modification in string1");
        referenceCheck(string1, string2);
        string1 += "World";
        System.out.println("After Modification:");
        referenceCheck(string1, string2);

    }
}
/*OUTPUT
Before Modification in string1
Both pointing to the same reference.
After Modification:
Both are pointing to different reference.
 */