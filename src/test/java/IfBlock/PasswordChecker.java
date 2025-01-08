package IfBlock;

import javax.xml.transform.Source;
import java.util.Scanner;

public class PasswordChecker {

    //Password Checker: Implement a simple password strength checker in Java. If the password length is less than
    // 8 characters, print "Weak Password". If it has 8 or more characters but doesn't contain any number, print
    // "Moderate Password". If it meets both conditions, print "Strong Password".

    public static void checkPasswordStrength(String password){
        if(password.length() < 8){
            System.out.println("Weak Password");
        }else if (!password.matches(".*\\d.*")) {
            System.out.println("Moderate password");
        }else{
            System.out.println("Strong Password");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        checkPasswordStrength(password);
    }
}
