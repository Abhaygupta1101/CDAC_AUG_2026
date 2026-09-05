package Oops_Assignment_1;

public class EmployeeCall {
	public static void main(String[] args) {
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee(); 
	Employee e4 = new Employee();
	
	System.out.println("Enter details of Employee 1 : ");
	e1.read();
	
	System.out.println("Enter details of Employee 2 : ");
	e2.read();
	
	System.out.println("Enter details of Employee 3 : ");
	e3.read();
	
	System.out.println("Enter details of Employee 4 : ");
	e4.read();
	
	System.out.println("Employee 1 ");
	e1.display(); 
	e1.calculateBonus();
	
	System.out.println("Employee 2 ");
	e2.display(); 
	e2.calculateBonus();
	
	System.out.println("Employee 3 ");
	e3.display(); 
	e3.calculateBonus();

	System.out.println("Employee 4 ");
	e4.display(); 
	e4.calculateBonus();
	
}
}