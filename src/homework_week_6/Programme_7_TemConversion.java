package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree celsius ((F-32 * 5/9 = 0 c)
 */

public class Programme_7_TemConversion {

        public static void main(String[] args) {
            // scanner declaration for reading input from console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the temperature in fahrenheit :");
            float temp = scanner.nextFloat();
            //object creation
            Programme_7_TemConversion t = new Programme_7_TemConversion();
            t.convertTempToDegreeCelsius(temp);
            // closing the scanner object
            scanner.close();
        }
            // Temperature conversion method
        public void convertTempToDegreeCelsius (float temp) {
            float c = ((temp-32) * 5/9);
            System.out.println(" The Temperature" + temp + "Fahrenheit is equal to " + c + "degree celsius");

        }
}
