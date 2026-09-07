package Oops_Assi_Inheritance;
import java.util.*;
class Vehicle{
	String vehicleNo;
	String brand;
	double price;
	static String dealerName = "Abhay Gupta";

	 Vehicle(String vehicleNo,String brand,double price){
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}
	 void display(){
		System.out.println("Enter the vehicleNo : " + vehicleNo);
        System.out.println("Enter the brand Name : "+ brand);
        System.out.println("Enter the price : " + price);
		System.out.println("Delar name : " +dealerName);
	}
}


class Car extends Vehicle{
	int numberofDoors;
	String fuleType;
	Car(int numberofDoors,String fuleType,String vehicleNo,String brand,double price){
		super( vehicleNo, brand,price);
		this.numberofDoors =numberofDoors;
		this.fuleType = fuleType;
	}
	void calculateInsuranceCar() {
		double CarIncurance  = price*8/100;
		double Carfinalprice =price +CarIncurance;
		System.out.println("Thiss is car insurance : " +  CarIncurance);
		System.out.println("This is your final price : "+Carfinalprice);
		}
	void display() {
		super.display();
		System.out.println("Enter the number of doors :" +numberofDoors);
		System.out.println("Enter the fuleType : "+fuleType);
		calculateInsuranceCar();
	}
}


class Bike extends Vehicle{
	String engineCC;
	boolean helmetIncluded;
	Bike(String cc1, boolean helmetIncluded,
		     String vehicleNo, String brand, double price) {

		    super(vehicleNo, brand, price);

		    this.engineCC = cc1;
		    this.helmetIncluded = helmetIncluded;
		}
	
	void calculateInsuranceBike() {
		double BikeIncurance = price * 5/100;
		double Bikefinalprice = price + BikeIncurance;
		System.out.println("Bike Incurance is : " + BikeIncurance);
		System.out.println("Final Price " + Bikefinalprice);
	}
	
	void display() {
		super.display();
		System.out.println("Enter the Engine CC :"+engineCC);
		System.out.println("Helmet Include Yes Or Not : " +  helmetIncluded);
		calculateInsuranceBike();	
	}
}


public class Vehicle_Hierar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Car 1 Details");

	        System.out.print("Enter Vehicle Number : ");
	        String carNo1 = sc.next();

	        System.out.print("Enter Brand : ");
	        String carBrand1 = sc.next();

	        System.out.print("Enter Price : ");
	        double carPrice1 = sc.nextDouble();

	        System.out.print("Enter Number of Doors : ");
	        int doors1 = sc.nextInt();

	        System.out.print("Enter Fuel Type : ");
	        String fuel1 = sc.next();

	        Car car1 = new Car(
	                doors1, fuel1,
	                carNo1, carBrand1, carPrice1
	        );
	        System.out.println("Enter Car 2 Details");

	        System.out.print("Enter Vehicle Number : ");
	        String carNo2 = sc.next();

	        System.out.print("Enter Brand : ");
	        String carBrand2 = sc.next();

	        System.out.print("Enter Price : ");
	        double carPrice2 = sc.nextDouble();

	        System.out.print("Enter Number of Doors : ");
	        int doors2 = sc.nextInt();

	        System.out.print("Enter Fuel Type : ");
	        String fuel2 = sc.next();

	        Car car2 = new Car(doors2, fuel2, carNo2, carBrand2, carPrice2);
	        


	        System.out.println("Enter Bike 1 Details");

	        System.out.print("Enter Vehicle Number : ");
	        String bikeNo1 = sc.next();

	        System.out.print("Enter Brand : ");
	        String bikeBrand1 = sc.next();

	        System.out.print("Enter Price : ");
	        double bikePrice1 = sc.nextDouble();

	        System.out.print("Enter Engine CC : ");
	       String cc1 = sc.next();

	        System.out.print("Is Helmet Included (true/false) : ");
	        boolean helmet1 = sc.nextBoolean();

	        Bike bike1 = new Bike(cc1, helmet1,bikeNo1, bikeBrand1, bikePrice1);
	        
	        
	        System.out.println("Enter Bike 2 Details");

	        System.out.print("Enter Vehicle Number : ");
	        String bikeNo2 = sc.next();

	        System.out.print("Enter Brand : ");
	        String bikeBrand2 = sc.next();

	        System.out.print("Enter Price : ");
	        double bikePrice2 = sc.nextDouble();

	        System.out.print("Enter Engine CC : ");
	    String cc2 = sc.next();

	        System.out.print("Is Helmet Included (true/false) : ");
	        boolean helmet2 = sc.nextBoolean();

	        Bike bike2 = new Bike(
	                cc2, helmet2,
	                bikeNo2, bikeBrand2, bikePrice2
	        );
	        car1.display();
	        car2.display();
	        bike1.display();
	        bike2.display();


	}
}
