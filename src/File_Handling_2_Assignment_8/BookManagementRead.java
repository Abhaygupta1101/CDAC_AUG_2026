package File_Handling_2_Assignment_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class BookManagementRead {

	 public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		
		FileInputStream fis = new FileInputStream("book.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Book b = (Book) ois.readObject();

		ois.close();
		fis.close();
       b.displayBook();
	}
}
