package Switch;

import java.util.Scanner;

public class DayOfTheWeek {

    //Day of the Week: Write a Java program that asks the user for a number (1-7) and prints the day of
    // the week corresponding to that number using a switch statement (1 for Monday, 2 for Tuesday, etc.).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
