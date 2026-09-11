package File_Handling_2_Assignment_8;

import java.io.FileReader;
import java.io.IOException;

public class CharacterFileRead {

    public static void main(String[] args) {

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        int space = 0;

        try {

            FileReader read = new FileReader("Java.txt");

            int ch;

            while ((ch = read.read()) != -1) {

                // Display file content
                System.out.print((char) ch);

                // Count uppercase
                if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                }

                // Count lowercase
                else if (ch >= 'a' && ch <= 'z') {
                    lower++;
                }

                // Count digits
                else if (ch >= '0' && ch <= '9') {
                    digit++;
                }

                // Count spaces
                else if (ch == ' ') {
                    space++;
                }

                // Count special characters
                else {
                    special++;
                }
            }

            read.close();

            // Display results
            System.out.println();
            System.out.println("Uppercase characters: " + upper);
            System.out.println("Lowercase characters: " + lower);
            System.out.println("Digits: " + digit);
            System.out.println("Special characters: " + special);
            System.out.println("Spaces: " + space);

        } catch (IOException e) {

            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}