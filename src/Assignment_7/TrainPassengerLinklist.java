
package Assignment_7;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainPassengerLinklist {

    LinkedList<String> ll = new LinkedList<>();

    Scanner sc = new Scanner(System.in);

    public LinkedList<String> addAtBeginning() {

        System.out.println("Enter passenger name to add:");

        String name = sc.next();

        ll.addFirst(name);

        return ll;
    }

    public LinkedList<String> addAtLast() {

        System.out.println("Enter passenger name to add:");

        String name = sc.next();

        ll.addLast(name);

        return ll;
    }

    public void removeAtBeginning() {

        if (ll.isEmpty()) {

            System.out.println("No passenger available");

        } else {

            String name = ll.removeFirst();

            System.out.println("Passenger " + name + " is removed");
        }
    }

    public void removeAtLast() {

        if (ll.isEmpty()) {

            System.out.println("No passenger available");

        } else {

            String name = ll.removeLast();

            System.out.println("Passenger " + name + " is removed");
        }
    }

    public void searchPassenger() {

        System.out.println("Enter passenger name to search:");

        String name = sc.next();

        if (ll.contains(name)) {

            System.out.println("Passenger is found");

        } else {

            System.out.println("Passenger not found");
        }
    }

    public void displayPassenger() {

        if (ll.isEmpty()) {

            System.out.println("No passengers available");

        } else {

            System.out.println("Passenger details:");

            for (String n : ll) {

                System.out.println(n);
            }
        }
    }
}
