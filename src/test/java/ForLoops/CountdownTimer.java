package ForLoops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountdownTimer {
    //Countdown Timer: Implement a countdown timer that takes a number from the user and counts down to 0,
    // printing each number. Use a for loop for the countdown, and make sure to include a sleep of 1 second
    // between each print to simulate a real timer.

    public static void counter(int numberOfSeconds) throws InterruptedException {
        for (int i = numberOfSeconds; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please enter the number of seconds you'd like the countdown to start from: ");
            int numberOfSeconds = scanner.nextInt();

            if(numberOfSeconds > 0){
                counter(numberOfSeconds);
            }else{
                while(numberOfSeconds < 0){
                    System.out.println("The number of seconds needs to be a positive value. Try again!");
                    numberOfSeconds = scanner.nextInt();
                    counter(numberOfSeconds);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (InterruptedException e){
            System.out.println("Oops! Something went wrong!");
        }
    }
}
