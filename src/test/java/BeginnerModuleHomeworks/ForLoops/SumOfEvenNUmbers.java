package BeginnerModuleHomeworks.ForLoops;

public class SumOfEvenNUmbers {

    //Sum of Even Numbers: Given an array of integers, write a Java program that calculates the sum of all even
    // numbers in the array using a for-each loop. You can hardcode the array or take input from the user.

    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 1, 6, 3, 4};
        int sum = 0;

        for (int number : numbers){
            if(number % 2 == 0){
                sum += number;
            }
        }

        System.out.println("The sum of even numbers is: " + sum);
    }
}
