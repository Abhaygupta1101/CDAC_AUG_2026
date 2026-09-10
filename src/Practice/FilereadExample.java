package Practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilereadExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileNAme = sc.nextLine();
		
		try {
			FileReader read = new FileReader(fileNAme);
			int ch;
			System.out.println("Data from file :");
			while ((ch = read.read()) != -1) {

			    System.out.print((char) ch);

			}   // closes while

			} catch (IOException e) {

			    System.out.println("Error occurred: " + e.getMessage());

			}   // closes catch
			
		}
	
}
