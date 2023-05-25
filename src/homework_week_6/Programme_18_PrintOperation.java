package homework_week_6;

import java.util.Scanner;

/**
 * Write a java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Input first number : 125
 * Input second number :24
 * Expected Output :
 * 125+24=149
 * 125-24=101
 * 125*24=3000
 * 125/24=5
 * 125 mod 24 =5
 */

public class Programme_18_PrintOperation {

        // Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of "+ a + " and " + b + " is " + (a + b));
        System.out.println("The Difference of "+ a + " and " + b + " is " + (a - b));
        System.out.println("The product of "+ a + " and " + b + " is " + (a * b));
        System.out.println("The Division of "+ a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of "+ a + " and " + b + " is " + (a % b));
    }

    public static void main (String [] args){
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter first number :");
        int firstnumber = scanner.nextInt();
        System.out.println("Please enter the second number :");
        int secodnumber = scanner.nextInt();
        Programme_18_PrintOperation printOperation = new Programme_18_PrintOperation();
        printOperation.printTheOperation(firstnumber,secodnumber);
        // closing the scanner object
        scanner.close();

    }
}
