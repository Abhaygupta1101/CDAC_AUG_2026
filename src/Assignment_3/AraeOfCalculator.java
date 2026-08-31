package Assignment_3;

public class AraeOfCalculator {
	public static double calculateArea(int choice, double value1, double value2) {
		double area =0;
		switch(choice) {
		case 1 : 
			area = Math.PI * value1 * value1;
			break;
			
		case 2 : 
			area =  value1 * value2;
			break;
			
		case 3 : 
			area = 0.5 * value1 * value2;
			break;
			
			default:
				System.out.println("Invalid choice");
		}
		return area;
	}

}
