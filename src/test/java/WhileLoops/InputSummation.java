package WhileLoops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSummation {

    //Input Summation: Write a Java program that continuously takes numbers as input from the user and adds them to a sum.
    // The loop should continue until the user enters 0, at which point the program should print the final sum and exit.

    public static void main(String[] args) {

        int sum = 0;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number");
            int number = scanner.nextInt();

            while (number != 0) {
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
