package Assignment_2_Java_File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BookManagementWrite {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner sc = new  Scanner(System.in);
		
		
		
		System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int  i=0; i<n; i++) {
		System.out.println("Enter the book details ");
		
		System.out.println("Entre book Id :");
		int bookId = sc.nextInt();
		
		System.out.println("Enter title : ");
		String title = sc.next();
		
		System.out.println("Enter author : ");
		String author = sc.next();
		
		System.out.println("Enter price : ");
		double price = sc.nextDouble();
		
		Book books = new Book(bookId,title,author,price);
        
		FileOutputStream fos = new FileOutputStream("book.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(books);
        
        oos.close();
        fos.close();
        }
	}
}
