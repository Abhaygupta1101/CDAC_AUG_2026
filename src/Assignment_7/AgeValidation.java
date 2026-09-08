package Assignment_7;

import java.util.Scanner;

// Custom Exception
class InvalidAge extends Exception {

    InvalidAge(String msg) {
        super(msg);
    }
}

public class AgeValidation {

    // Method to check age
    public static void checkAge(int age) throws InvalidAge {

        if (age < 18) {
            throw new InvalidAge("Invalid Age: Age must be 18 or above");
        }

        System.out.println("Age is valid. You can register for the event.");
    }

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your age:");
            int age = sc.nextInt();

            checkAge(age);

        } catch (InvalidAge e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Final statement is executed");
        }
    }
}