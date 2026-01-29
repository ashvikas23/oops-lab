import java.io.*;
import java.util.*;

class StringManipulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a, b, c;

        System.out.print("Enter a string: ");
        a = s.next();

        System.out.print("Enter another string: ");
        b = s.next();

        c = a + b;

        System.out.println("Length of 1st String: " + a.length());
        System.out.println("Length of 2nd String: " + b.length());
        System.out.println("Concatenated String: " + c);

        if (c.length() > 5) {
            System.out.println("Character at position 5 of " + c + ": " + c.charAt(5));
        } else {
            System.out.println("String is too short for character at position 5.");
        }

        System.out.println("Comparison of Strings: " + a.compareTo(b));
        
        System.out.println("Last Index of 's' is: " + c.lastIndexOf('s'));

        System.out.println("Ends with character 'r': " + c.endsWith("r"));
        System.out.println("Conversion to Uppercase: " + c.toUpperCase());
        System.out.println("Conversion to Lowercase: " + c.toLowerCase());
    }
}
