package BeginnerModuleHomeworks.ForEachLoops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {

    //Factorial Calculator: Create a program that calculates the factorial of a number provided by the user.
    // Use a for loop to calculate the factorial. Remember, the factorial of n (n!) is the product of all positive
    // integers less than or equal to n.
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please provide a positive integer number: ");
            int number = scanner.nextInt();

            while (number < 0){
                System.out.println("Please provide a positive number:");
                number = scanner.nextInt();
            }

            int factorial = 1;
            for(int i = 1; i <= number; i++){
                factorial *= i;
            }

            System.out.println(factorial);

        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }


}
