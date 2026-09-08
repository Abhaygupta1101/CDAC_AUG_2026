package Assignment_6;

import java.util.Scanner;

class TravelBooking {

    int bookingId;
    String passengerName;
    String source;
    String destination;
    double distance;

    TravelBooking(int bookingId, String passengerName,
                  String source, String destination, double distance) {

        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    void display() {
        System.out.println("Booking Id : " + bookingId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Distance : " + distance);
    }
}

class BusBooking extends TravelBooking {

    String busType;
    int seatNumber;

    BusBooking(int bookingId, String passengerName,
               String source, String destination,
               double distance, String busType, int seatNumber) {

        super(bookingId, passengerName, source, destination, distance);

        this.busType = busType;
        this.seatNumber = seatNumber;
    }

    @Override
    void display() {
        super.display();

        System.out.println("Bus Type : " + busType);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Fare : " + (distance * 4));
    }
}

class TrainBooking extends TravelBooking {

    int trainNumber;
    String coachType;

    TrainBooking(int bookingId, String passengerName,
                 String source, String destination,
                 double distance, int trainNumber, String coachType) {

        super(bookingId, passengerName, source, destination, distance);

        this.trainNumber = trainNumber;
        this.coachType = coachType;
    }

    @Override
    void display() {
        super.display();

        System.out.println("Train Number : " + trainNumber);
        System.out.println("Coach Type : " + coachType);
        System.out.println("Fare : " + (distance * 2));
    }
}

public class TravelBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Travel Booking System ---------------");
        System.out.println("1. Bus Booking");
        System.out.println("2. Train Booking");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter your Booking Id : ");
        int bookingId = sc.nextInt();

        System.out.print("Enter passenger Name : ");
        String name = sc.next();

        System.out.print("Enter source : ");
        String source = sc.next();

        System.out.print("Enter destination : ");
        String destination = sc.next();

        System.out.print("Enter distance : ");
        double distance = sc.nextDouble();

        TravelBooking booking;

        if (choice == 1) {

            System.out.print("Enter Bus type : ");
            String busType = sc.next();

            System.out.print("Enter seat Number : ");
            int seatNumber = sc.nextInt();

            BusBooking bus = new BusBooking(
                    bookingId, name, source, destination,
                    distance, busType, seatNumber
            );

            booking = bus;

            System.out.println("Bus Booking Details ------------");
            booking.display();

        } else if (choice == 2) {

            System.out.print("Enter Train Number : ");
            int trainNumber = sc.nextInt();

            System.out.print("Enter Coach Type : ");
            String coachType = sc.next();

            TrainBooking train = new TrainBooking(
                    bookingId, name, source, destination,
                    distance, trainNumber, coachType
            );

            booking = train;

            System.out.println("Train Booking Details ------------");
            booking.display();

        } else {
            System.out.println("Invalid Choice");
        }

     
    }
}