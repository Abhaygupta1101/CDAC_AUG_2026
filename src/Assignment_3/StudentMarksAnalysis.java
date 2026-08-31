package Assignment_3;
import java.util.*;
public class StudentMarksAnalysis {

	public static double[] calcMarks(int[] marks) {
		int total = 0;
		int hight = marks[0];
		int lowest = marks[0];
		for(int i =0; i<marks.length;i++) {
			total =total +marks[i];
			if(marks[i] > hight)
				hight =marks[i];
			if(marks[i]<lowest)
				lowest =marks[i];
			
			
		}
		double average =(double)total/marks.length;
		return new double[] {total,average,hight,lowest};
		  
			
		}
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Student " );
			int n = sc.nextInt();
			int[]  marks =new int[n];
			System.out.println("Enter marks of " + n + "student : ");
			for(int i =0;i<n;i++) {
				marks[i] = sc.nextInt();
			}
			double[] result = calcMarks(marks);

	        System.out.println("Total = " + result[0]);
	        System.out.println("Average = " + result[1]);
	        System.out.println("Highest Mark = " + result[2]);
	        System.out.println("Lowest Mark = " + result[3]);
			
	}
}
