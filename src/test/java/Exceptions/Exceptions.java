package Exceptions;

public class Exceptions {

    public static void main(String[] args) throws CustomExceptions {
        try {
            System.out.println(12 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception thrown " + e.getMessage());
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            int[] numbers = new int[10];
            numbers[11] = 2;
        } catch (IndexOutOfBoundsException e) {
            throw new CustomExceptions("Custom error");
//          System.out.println("Error: IndexOutOfBounds exception thrown " + e.getMessage());
        } finally {
            System.out.println("This line is executed all the time");
        }
    }
}
