package BeginnerModuleHomeworks.WhileLoops;

import java.util.Scanner;

public class PalindromeChecker {

    //Palindrome Checker: Create a Java program that checks if a given string is a palindrome. Use a while loop
    // to compare characters from the beginning and the end of the string, moving towards the center.
    // A palindrome reads the same backward as forward, like "radar" or "level".

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a word!");
        String myWord = scanner.nextLine();

        if (checkIfPalindrome(myWord)) {
            System.out.println("Your word is a palindrome!");
        } else {
            System.out.println("Your word is not a palindrome!");
        }

        scanner.close();
    }

    public static boolean checkIfPalindrome(String myWord) {

        int startOfWord = 0;
        int endOfWord = myWord.length();

        while (startOfWord < endOfWord) {

            if (myWord.charAt(startOfWord) != myWord.charAt(endOfWord - 1)) {
                return false;
            }
            startOfWord++;
            endOfWord--;
        }
        return true;
    }
}
