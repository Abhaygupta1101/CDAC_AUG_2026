package File_Handling_2_Assignment_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFileWrite {

	public static void main(String[] args) throws IOException {
		
		
		//System.out.println("Enter the details");
		
		FileWriter fw = new FileWriter("Java.txt");
		Scanner sc = new Scanner(System.in);
		//only for one line 
		String str = sc.nextLine();
		while(str.length() > 0){

            int i = 0;

            while (i < str.length()) {
                fw.write(str.charAt(i));
                i++;
            }

            break;
		}
		fw.close();
	}
}
