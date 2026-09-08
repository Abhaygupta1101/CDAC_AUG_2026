package Assignment_6;

import java.util.Scanner;

class Vehicle {

    String vehicleNo;
    String brand;
    double Rentperday;

    Vehicle(String vehicle, String brand, double Rentperday) {
        this.vehicleNo = vehicle;       // corrected
        this.brand = brand;
        this.Rentperday = Rentperday;
    }

    void display() {
        System.out.println("Vehicle Number : " + vehicleNo);
        System.out.println("Brand : " + brand);
        System.out.println("Rent Per Day : " + Rentperday);
    }

    double calculateRent() {
        return Rentperday;
    }
}

class Car extends Vehicle {

    int numberOfseat;
    double insurance;
    double days;

    Car(String vehicle, String brand, double Rentperday,
        int numberOfseat, double insurance, double days) {

        super(vehicle, brand, Rentperday);

        this.numberOfseat = numberOfseat;
        this.insurance = insurance;
        this.days = days;
    }

    @Override
    double calculateRent() {
        return (Rentperday * days) + insurance;
    }

    void display() {
        super.display();

        System.out.println("Number of Seats : " + numberOfseat);
        System.out.println("Insurance : " + insurance);
        System.out.println("Days : " + days);
        System.out.println("Total Rent : " + calculateRent());
    }
}

class Bike extends Vehicle {

    int helmetCount;
    double maintenanceCharge;
    double days;

    Bike(String vehicle, String brand, double Rentperday,
         int helmetCount, double maintenanceCharge, double days) {

        super(vehicle, brand, Rentperday);

        this.helmetCount = helmetCount;
        this.maintenanceCharge = maintenanceCharge;
        this.days = days;
    }

    @Override
    double calculateRent() {
        return (Rentperday * days) + maintenanceCharge;
    }

    void display() {
        super.display();

        System.out.println("Helmet Count : " + helmetCount);
        System.out.println("Maintenance Charge : " + maintenanceCharge);
        System.out.println("Days : " + days);
        System.out.println("Total Rent : " + calculateRent());
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vehicle Rental System");
      
        System.out.println("\nEnter Car Details");

        System.out.print("Enter Vehicle Number : ");
        String carNo = sc.next();

        System.out.print("Enter Brand : ");
        String carBrand = sc.next();

        System.out.print("Enter Rent Per Day : ");
        double carRent = sc.nextDouble();

        System.out.print("Enter Number of Seats : ");
        int seats = sc.nextInt();

        System.out.print("Enter Insurance Charge : ");
        double insurance = sc.nextDouble();

        System.out.print("Enter Number of Days : ");
        double carDays = sc.nextDouble();

        Car car = new Car(
                carNo, carBrand, carRent,
                seats, insurance, carDays
        );

        System.out.println(" ------Car Rental Details");
       
        car.display();


      
        System.out.println("--------Enter Bike Details");

        System.out.print("Enter Vehicle Number : ");
        String bikeNo = sc.next();

        System.out.print("Enter Brand : ");
        String bikeBrand = sc.next();

        System.out.print("Enter Rent Per Day : ");
        double bikeRent = sc.nextDouble();

        System.out.print("Enter Helmet Count : ");
        int helmets = sc.nextInt();

        System.out.print("Enter Maintenance Charge : ");
        double maintenance = sc.nextDouble();

        System.out.print("Enter Number of Days : ");
        double bikeDays = sc.nextDouble();

        Bike bike = new Bike(
                bikeNo, bikeBrand, bikeRent,
                helmets, maintenance, bikeDays
        );

        System.out.println("---------Bike Rental Details");
        bike.display();

      
    }
}