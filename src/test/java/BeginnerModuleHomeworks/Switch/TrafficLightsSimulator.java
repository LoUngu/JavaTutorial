package BeginnerModuleHomeworks.Switch;

import java.util.Scanner;

public class TrafficLightsSimulator {
    //Traffic Light Simulator: Simulate a traffic light using a switch statement. The user inputs one
    // of three colors (red, yellow, green), and the program prints out what a driver should do
    // (e.g., "Stop" for red).


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a traffic light color: ");
        String color = scanner.nextLine();

        switch (color) {
            case "red": {
                System.out.println("Stop" );
                break;
            }
            case "yellow": {
                System.out.println("Stop if you can do it safely!" );
                break;
            }
            case "green": {
                System.out.println("GO!GO!GO!");
                break;
            }
            default:
                System.out.println("Invalid color");
        }
    }
}
