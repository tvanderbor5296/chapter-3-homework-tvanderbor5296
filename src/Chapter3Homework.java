// Name: Trenton VanderBor
// This program prompts the user to input a binary integer and
// prints its decimal equivalent.

import java.util.Scanner; //program uses class scanner

public class Chapter3Homework {
    // main method begins the Java application
    public static void main(String[] args) {
        // create scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declaration
        int value = 0; // binary value
        int decimal = 0; // decimal value
        int multiplier = 1; // the pow of 2

        System.out.print("Enter a binary number: ");
        value = input.nextInt();

        // the loop
        while (value > 0) {
            int digit = value % 10;

            if (digit != 0 && digit != 1) {
                System.out.print("Number is not binary");
                System.exit(0);
            }
            // converting binary number to decimal equivalent
            else {
                decimal += digit * multiplier;
                multiplier *= 2;
                value /= 10;
            }
        }
        // print decimal value
        System.out.print("The decimal value is: " + decimal);
    } // end main method
} // end class Chapter3Homework
