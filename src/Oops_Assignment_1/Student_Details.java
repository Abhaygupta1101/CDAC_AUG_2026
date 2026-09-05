
package Oops_Assignment_1;

public class Student_Details {
	

	static class student{
	int rollNo;
	String name;
	int marks;
	
	void calculateGrade() {
		if(marks >=90 && marks <=100) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}
		
	}
	
	 void display(){
		System.out.println("Enter the Studen RollNO : " + rollNo);
		System.out.println("Enter the student name : " + name);
		System.out.println("Enter the student marks : " + marks);
		
		calculateGrade();
		System.out.println();
	}
		
	}
}	