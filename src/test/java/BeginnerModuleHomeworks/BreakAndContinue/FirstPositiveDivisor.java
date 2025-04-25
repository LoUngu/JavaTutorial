package BeginnerModuleHomeworks.BreakAndContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstPositiveDivisor {

    //Find the First Positive Divisor: Write a Java program that finds the first positive divisor (other than 1)
    // of a number entered by the user. Use a loop and a break statement when the divisor is found.

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer number to find its first positive divisor: ");

        try {
            number = scanner.nextInt();

            if (number <= 1) {
                System.out.println("Please enter a number grater than 1");
            } else {
                for (int divisor = 2; divisor <= number; divisor++) {
                    if (number % divisor == 0) {
                        System.out.println("First positive divisor of " + number + "  besides 1 is " + divisor);
                        break;
                    }
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input");
        }
    }
}
