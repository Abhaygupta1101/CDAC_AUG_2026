package Assignment_7;
import java.util.*;
import java.util.HashMap;

public class BookHashMapMain {
public static void main(String[] args) {

	
	
	Scanner sc = new Scanner(System.in);
	BookManagMentSystemHashMap bh = new BookManagMentSystemHashMap();
	
	HashMap<Integer,Book> ha;
	
	while(true) {
		System.out.println("1. Add Book");
		System.out.println("2. Display Books");
		System.out.println("3. Search Book by Id");
		System.out.println("4. Update Book");
		System.out.println("5. Delet Book");
		System.out.println("6. Exit");
		
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: ha = bh.addBook();
		break;
		
		case 2: bh.displayBooks();
		 break;
		 
		case 3: bh.search();
		break;
		
		case 4: bh.updateBook();
		break;
		
		case 5: bh.deleteBook();
		break;
		
		case 6: System.out.println("Program End !");
		System.exit(0);
		
		}
	}
}
}
		

