package IfBlock;

import java.util.Scanner;

public class LeapYearChecker {

    //Leap Year Checker: Write a Java program to check whether a year (input from the user) is a leap year or not.
    // Remember, a leap year is divisible by 4 but not by 100 unless it's also divisible by 400

    public static void checkIfIsLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");

        int year = scanner.nextInt();

        checkIfIsLeapYear(year);
    }
}
