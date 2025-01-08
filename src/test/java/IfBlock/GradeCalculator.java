package IfBlock;
import java.util.Scanner;

public class GradeCalculator {

    //Grade Calculator: Write a Java program that takes a score (e.g., 87) as input and assigns a grade
    // based on the score (A for 90 and above, B for 80-89, C for 70-79, D for 60-69, and F for below 60)
    // using if-else blocks. Print the grade.

    public static void calculateGrade(Integer score){
        if(score > 90){
            System.out.println("Your grade is A");
        } else if (score >= 80) {
            System.out.println("Your grade is B");
        }
        else if (score >= 70) {
            System.out.println("Your grade is C");
        }
        else if (score >= 60) {
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        Integer score = scanner.nextInt();

        calculateGrade(score);
    }
}
