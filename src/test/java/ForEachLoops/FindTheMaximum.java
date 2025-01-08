package ForEachLoops;

public class FindTheMaximum {

    //Find the Maximum: Write a Java program that finds the maximum value in an array of integers. Use a for-each
    //loop to iterate through the array. You can initialize the array with some values or take the input from the user.

    public static void main(String[] args) {

        int[] numbers = {1, 8, 2, 3, 9, 4, 5, 6, 7, 0};

        int max = 0;
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        System.out.println("Maximum is: " + max);
    }

}
