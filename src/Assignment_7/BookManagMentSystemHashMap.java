package Assignment_7;

import java.util.HashMap;
import java.util.Scanner;

public class BookManagMentSystemHashMap {

    HashMap<Integer, Book> hm = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    // ADD BOOK
    public HashMap<Integer, Book> addBook() {

        Book b = new Book();

        if (hm.containsKey(b.bookId)) {

            System.out.println("Book ID already exists");

        } else {

            hm.put(b.bookId, b);

            System.out.println("Book added");
        }

        return hm;
    }
    
    
    

    // DISPLAY BOOKS
    public void displayBooks() {

        for (HashMap.Entry<Integer, Book> m : hm.entrySet()) {

            System.out.println("Book ID: " + m.getKey());

            m.getValue().display();
        }
    }
    

    // SEARCH BOOK
    public void search() {

        System.out.println("Enter the book Id:");

        int id = sc.nextInt();

        Book b = hm.get(id);

        if (b != null) {

            System.out.println("Book Found");

            b.display();

        } else {

            System.out.println("Book not found");
        }
    }
    

    // UPDATE BOOK
    public void updateBook() {

        System.out.println("Enter Book id:");

        int id = sc.nextInt();

        Book obj = hm.get(id);

        if (obj != null) {

            System.out.println("Enter new title:");

            String title = sc.next();

            System.out.println("Enter new price:");

            double price = sc.nextDouble();

            obj.title = title;
            obj.price = price;

            System.out.println("Book updated successfully");

        } else {

            System.out.println("Book not found");
        }
    }
    
    

    // DELETE BOOK
    public void deleteBook() {

        System.out.println("Enter the Book Id to delete:");

        int id = sc.nextInt();

        if (hm.containsKey(id)) {

            hm.remove(id);

            System.out.println("Book with ID " + id + " is removed");

        } else {

            System.out.println("Book is not found");
        }
    }
}