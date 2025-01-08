package WhileLoops;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    //Guessing Game: Implement a guessing game where the program selects a random number between 1 and 100,
    // and the user has to guess it. Use a while loop to allow the user unlimited attempts until they guess
    // the number correctly. After each guess, the program should tell the user if the guess is too high or too low.

    public static void main(String[] args) {
        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {
            int number = random.nextInt(1, 101);
            System.out.println(number);

            System.out.println("Please guess the number between 1 and 100!");
            int guessedNumber = scanner.nextInt();

            while (guessedNumber != number) {
                if(guessedNumber < number){
                    System.out.println("The guess is too low!");
                }else {
                    System.out.println("The guess is too high!");
                }
                System.out.println("Please try again!");
                guessedNumber = scanner.nextInt();
            }
            System.out.println("Congrats, you guessed the number!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}