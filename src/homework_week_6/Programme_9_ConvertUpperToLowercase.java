package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Programme_9_ConvertUpperToLowercase {
    public static void main(String[] args){
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Uppercase string :");
        String Uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowercase t = new Programme_9_ConvertUpperToLowercase();
        t.convertUppercaseToLowercase(Uppercase);
        // closing the scanner object
        scanner.close();
    }
        // conversion of Uppercase to lower case method
        public void convertUppercaseToLowercase(String text){
            System.out.println("the lowercase value is =" + text.toLowerCase());

        }
}
