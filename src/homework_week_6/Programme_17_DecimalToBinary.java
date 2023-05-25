package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to convert a decimal number to binary number.
 * Input data:
 * Input a Decimal Number :5
 * Expected Output
 * BInary number is : 101
 */
public class Programme_17_DecimalToBinary {

            public static void main (String [] args){
                    // scanner declaration for reading input from console
                System.out.println("Welcome to java program to convert decimal to binary numbers");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter decimal number");
                int number = scanner.nextInt();
                convertDecimalToBinary(number);
                // closing the scanner object
                scanner.close();
            }

                    // converting the decimal to binary
            public static void convertDecimalToBinary(int number ){
                String binary = Integer.toBinaryString(number);
                System.out.println("The binary value is : "+ binary);

            }
}
