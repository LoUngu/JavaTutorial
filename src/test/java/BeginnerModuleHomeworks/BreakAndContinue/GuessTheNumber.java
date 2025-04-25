package BeginnerModuleHomeworks.BreakAndContinue;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    //Guess the Number Game: Implement a simple "guess the number" game where the program randomly selects
    // a number between 1 and 10, and the user has a maximum of 5 attempts to guess it. Use a loop with a break
    // statement to end the game if the user guesses correctly or uses up all attempts.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            int number = random.nextInt(1, 11);
            System.out.println("Please guess the number between 1 and 10!");

            for (int i = 0; i < 5; i++) {

                int guessedNumber = scanner.nextInt();

                while (guessedNumber < 1 || guessedNumber > 10) {
                    System.out.println("Please insert a number between 1 and 10! You just waisted a chance to win :(!");
                    i++;
                    guessedNumber = scanner.nextInt();
                }
                if (number == guessedNumber) {
                    System.out.println("Congrats! You guessed the number!");
                    break;
                }

                if (i == 4) {
                    System.out.println("No luck! You've reached the maximum chances to guess the number!");
                } else {
                    System.out.println("Please guess again");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
