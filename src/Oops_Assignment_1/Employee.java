package Oops_Assignment_1;
import java.util.*;
public class Employee {
	int empId;
	String empName;
	double salary;
	
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id : " );
		empId = sc.nextInt();
		
		System.out.println("Enter the Employee Name : " );
		empName = sc.next();
		
		System.out.println("Enter the Employee Salary : " );
		salary = sc.nextInt();
		
		
	}
	
	void display(){
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName); 
		System.out.println("Salary: " + salary);
		
		}
	void calcu() {
		double bonus;
		if(salary >= 50000) {
			bonus = salary*10/100;
		}
	 else {
			bonus = salary*5/100;
		}
		System.out.println("Bonus: " + bonus); 
		System.out.println();
	}
	
}
