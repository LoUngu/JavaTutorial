package Switch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstnumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter an operator: ");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+": {
                System.out.println("The result is: " + (firstnumber + secondNumber));
                break;
            }
            case "-": {
                System.out.println("The result is: " + (firstnumber - secondNumber));
                break;
            }
            case "/": {
                if (secondNumber != 0) {
                    System.out.println("The result is: " + (firstnumber / secondNumber));
                } else {
                    System.out.println("Division by 0 is not allowed!");
                }
                break;
            }
            case "*": {
                System.out.println("The result is: " + (firstnumber * secondNumber));
                break;
            }
            default:
                System.out.println("Invalid operator");
        }
    }
}
