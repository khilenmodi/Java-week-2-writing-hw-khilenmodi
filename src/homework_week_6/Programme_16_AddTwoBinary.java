package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to add two binary numbers.
 * input data :
 * Input first binary number :10
 * Input second binary number : 11
 */

public class Programme_16_AddTwoBinary {

        public static void main (String [] args){
            // scanner declaration for reading input from console
            System.out.println("Welcome to the java program to add two binary numbers");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first binary numbers");
            String first = scanner.nextLine();
            System.out.println("Please enter second binary number ");
            String second = scanner.nextLine();
            String addition = addTwoBinaryNumbers(first, second);
            System.out.println("the addition of two binary number is :" + addition);
            // closing the scanner object
            scanner.close();

        }
        // Adding the two Binary Numbers
        public static String addTwoBinaryNumbers(String first, String second){
            int b1 = Integer.parseInt(first, 2);
            int b2 = Integer.parseInt(second, 2);
            int sum = b1 + b2;
            return Integer.toBinaryString(sum);
        }
}
