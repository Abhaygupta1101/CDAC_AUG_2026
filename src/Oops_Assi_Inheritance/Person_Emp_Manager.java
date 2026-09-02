package Oops_Assi_Inheritance;

class person{
	String name;
	int age;
	static String organization = "Cdac";
	
	person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	void display() {
		System.out.println("Enter the person name "+ name);
		System.out.println("Enter the person nage " + age);
		System.out.println("Organization Name  " + organization);
	}
}

  class Employee2 extends person{
	  int emId;
		int salary;
	  
	  Employee2(int emId,int salary,String name, int age){
		super( name, age);
		this.emId = emId;
		this.salary =salary;
	  }
	  
	  void display() {
		  super.display();
		  System.out.println("Enter the emp Id " + emId);
		  System.out.println("Enter the salary " + salary);
		   }
  }
  
  class Manager2 extends Employee2{
	  String department;
	  int timesize;
	  
	  Manager2(String department,int timesize,int emId,int salary,String name, int age){
      super( emId, salary, name,  age);		  
      this.department =department;
      this.timesize = timesize;
	  }
	  
	void display() {
		super.display();
		System.out.println(" Manager department " +department );
		System.out.println("TimeSize "+ timesize);
		
	}
	  
	  
  }

public class Person_Emp_Manager {
	public static void main(String[] args) {
		System.out.println("Enter the details ");
		Manager2 m2 = new Manager2("Networking",20,101,10000,"Abhay", 21);
		m2.display();
	}
	
	

}
