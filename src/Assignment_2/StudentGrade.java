package Assignment_2;
import java.util.*;

public class StudentGrade {
 
	public static char CaluclateGrade(int marks) {
		char grade = 0;
		
		if(marks>=90 && marks<=100)
			grade = 'A';
		
		else if(marks>=75 && marks < 89)
			grade = 'B';
		
		else if(marks >=60 && marks<74)
			grade = 'C';
		
		else if(marks>=50  && marks < 59)
			grade ='D';
		
		else if (marks<50)
			grade ='F';
		
		else
			System.out.println("Input is not valid ");
		
		return grade;
		
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the marks ");
		
		int marks = sc.nextInt();
		
	char g =	StudentGrade.CaluclateGrade(marks);
	System.out.println("This is your result : " +  g);
	}
	
}
