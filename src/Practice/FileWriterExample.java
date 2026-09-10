package Practice;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
//public class filewriterExmaple {
// public static void main(String[] args) {
//	Scanner sc  = new Scanner(System.in);
//	
//	System.out.println("Enter the file name");
//	String fileNAme = sc.nextLine();
//	
//	System.out.println("Enter the data to write : ");
//	String data = sc.nextLine();
//	
//	try {
//		FileWriter write = new FileWriter(fileNAme);
//		write.write(data);
//		write.close();
//		System.out.println("data write successfully");
//		
//		
//	}
//	catch(IOException e) {
//		System.out.println("Error occurred");
//	}
//}
//}




import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 

public class FileWriterExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter file name:");
	String fileName = sc.nextLine(); 
	try {
		FileWriter write = new FileWriter(fileName); 
		System.out.println("Enter data (type 'exit' to stop):"); 
		while (true) {
			String data = sc.nextLine();
			if (data.equalsIgnoreCase("exit")) {
				break;
				}
			write.write(data + "\n"); 
				} 
		write.close(); 
		System.out.println("Data written successfully"); 
		} catch (IOException e) {
			System.out.println("Error occurred: " + e.getMessage());
			} sc.close(); 
			}
}
