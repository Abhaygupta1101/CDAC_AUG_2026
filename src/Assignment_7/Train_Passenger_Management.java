
package Assignment_7;

import java.util.Scanner;

public class Train_Passenger_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TrainPassengerLinklist lm = new TrainPassengerLinklist();

        while (true) {

            System.out.println("\n1. Add Passenger at Beginning");
            System.out.println("2. Add Passenger at End");
            System.out.println("3. Remove First Passenger");
            System.out.println("4. Remove Last Passenger");
            System.out.println("5. Search Passenger");
            System.out.println("6. Display Passengers");
            System.out.println("7. Exit");

            System.out.println("Enter your choice");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                lm.addAtBeginning();
                break;

            case 2:
                lm.addAtLast();
                break;

            case 3:
                lm.removeAtBeginning();
                break;

            case 4:
                lm.removeAtLast();
                break;

            case 5:
                lm.searchPassenger();
                break;

            case 6:
                lm.displayPassenger();
                break;

            case 7:
                System.out.println("Exiting from program...!");
                System.exit(0);

            default:
                System.out.println("Invalid choice!!");
            }
        }
    }
}

