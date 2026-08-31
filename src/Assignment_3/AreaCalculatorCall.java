package Assignment_3;

import java.util.*;

public class AreaCalculatorCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double value1 = 0;
        double value2 = 0;

        switch (choice) {

        case 1:
            System.out.print("Enter radius: ");
            value1 = sc.nextDouble();

            double circleArea =
                    AraeOfCalculator.calculateArea(choice, value1, value2);

            System.out.println("Area of Circle = " + circleArea);
            break;

        case 2:
            System.out.print("Enter length: ");
            value1 = sc.nextDouble();

            System.out.print("Enter breadth: ");
            value2 = sc.nextDouble();

            double rectangleArea =
                    AraeOfCalculator.calculateArea(choice, value1, value2);

            System.out.println("Area of Rectangle = " + rectangleArea);
            break;

        case 3:
            System.out.print("Enter base: ");
            value1 = sc.nextDouble();

            System.out.print("Enter height: ");
            value2 = sc.nextDouble();

            double triangleArea =
                    AraeOfCalculator.calculateArea(choice, value1, value2);

            System.out.println("Area of Triangle = " + triangleArea);
            break;

        case 4:
            System.out.println("Exit");
            break;

        default:
            System.out.println("Invalid choice");
        }

       
    }
}