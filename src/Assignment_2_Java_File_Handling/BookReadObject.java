package Assignment_2_Java_File_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BookReadObject {

	 public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	 
		
try {
		Book e = (Book)ois.readObject();
		
		e.displayBook();
		
		if (e.price > 500) {

            double discount = e.price * 10 / 100;

            double finalPrice = e.price - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);

        } else {

            System.out.println("No discount");
            System.out.println("Final Price: " + e.price);
        }

		 
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error occurred: " + e.getMessage());
	}
	 

     fis.close();
     ois.close();
	 }
}
