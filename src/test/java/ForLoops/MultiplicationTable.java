package ForLoops;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class MultiplicationTable {
    //Multiplication Table: Write a Java program that prints out the multiplication table for a number up to 10.
    // For example, if the user inputs 3, your program should print the multiplication table for 3 (3 x 1 = 3,
    // 3 x 2 = 6, ..., 3 x 10 = 30) using a for loop.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please provide a number up to 10: ");
            int number = scanner.nextInt();
            while (number > 10) {
                System.out.println("The number should be up to 10. Please try again!");
                number = scanner.nextInt();
            }

            System.out.println("The multiplication table for " + number + " is: ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(number * i + " ");

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } finally {
            scanner.close();
        }
    }
}

