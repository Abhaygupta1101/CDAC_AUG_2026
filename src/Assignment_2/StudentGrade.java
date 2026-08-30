package Assignment_2;
import java.util.*;
public class StudentGrade {
 
	public static char CalculateGrade(int marks) {
		char grade;
		if(marks>=90 && marks<=100)
			grade ='A';
		else if(marks>=75 && marks<=89)
			grade ='B';
		else if(marks>=60 && marks<=74)
			grade ='C';
		else if(marks>=50 && marks<=59)
			grade ='D';
		else
			grade ='F';
		return grade;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int marks = sc.nextInt();
		char grade = CalculateGrade(marks);
		
		  System.out.println("Grade = " + grade);
		
		
	}
}
