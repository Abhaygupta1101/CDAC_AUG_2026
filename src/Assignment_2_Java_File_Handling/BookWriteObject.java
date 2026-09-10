package Assignment_2_Java_File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BookWriteObject {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        // Create Book object
        Book book = new Book(bookId, title, author, price);

        // Create file
        FileOutputStream fos = new FileOutputStream("book.txt");

        // Create ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write object into file
        oos.writeObject(book);

        System.out.println("Object written successfully.");

        oos.close();
        fos.close();
        sc.close();
    }
}