package File_Handling_2_Assignment_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class String_Based_File_Handling_Writer {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str =sc. nextLine();
		
		try {
			FileWriter fw2 = new FileWriter("Aman.txt");
			fw2.write(str);
			
			fw2.close();
		}catch(IOException e) {
			 System.out.println("Error: " + e.getMessage());
		}
		
	}
}
