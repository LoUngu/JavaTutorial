package BeginnerModuleHomeworks.BreakAndContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SkipNegativeNumbers {
    //Skip Negative Numbers: Create a program that sums up numbers entered by the user until the user enters 0.
    // Use a continue statement to skip any negative numbers and print the final sum.

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a number");
            int number = scanner.nextInt();

            while (number != 0) {

                if (number < 0) {
                    System.out.println("Negative numbers are ot allowed. Please enter another number: ");
                    number = scanner.nextInt();
                    continue;
                }

                sum += number;
                System.out.println("Please enter another number: ");
                number = scanner.nextInt();


            }
            System.out.println("The sum is: " + sum);

        } catch (InputMismatchException exception) {
            System.out.println("Invalid input");
        }
    }
}
