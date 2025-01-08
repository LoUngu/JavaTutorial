package ForEachLoops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountVowels {

    //Count Vowels: Create a program that counts the number of vowels in a given string. Use a for-each loop to
    // iterate through the characters of the string. Consider A, E, I, O, U as vowels for this exercise.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a string: ");
        String givenString = scanner.nextLine();

        List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');
        int vowelsCounter = 0;

        for( Character c : givenString.toCharArray()){
            if(vowels.contains(Character.toUpperCase(c))) {
                vowelsCounter++;
            }
        }

        System.out.println("There are " + vowelsCounter + " vowels in the given string");
    }
}
