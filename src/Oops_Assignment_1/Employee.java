package Oops_Assignment_1;
import java.util.*;


public class Employee {
	
	int empId;
	String name;
	long salary;
	
	void read(){
	Scanner sc = new Scanner(System.in);

	
	System.out.println("Enter the employee Id ");
	empId = sc.nextInt();
	
	System.out.println("Enter the employee Name ");
	name = sc.next();
	
	System.out.println("Enter the employee salary ");
	salary = sc.nextLong();
	}
	
	 void display(){
	System.out.println("Employe Id : " + empId);
	System.out.println("Employee name : " + name);
	System.out.println("Employee Salary : " + salary);
	}
	 
	 void calculateBonus() {
		 double bonus;
		 if(salary >= 50000) {
			 bonus = salary*0.10;
		 }
		 else  {
			 bonus =salary*0.05;
		 }
		 System.out.println("Bonus: " + bonus);
	 }
}