package Assignment_2_Java_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class String_Based_File_Handling_Read {

    public static void main(String[] args) {

        try {

            FileReader fr2 = new FileReader("Aman.txt");

            BufferedReader br2 = new BufferedReader(fr2);

            String str = br2.readLine();

            br2.close();

            // Count words
            String[] words = str.split(" ");

            int wordCount = words.length;

            // Vowels and consonants count
            int vowels = 0;
            int consonants = 0;

            int i = 0;

            while (i < str.length()) {

                char ch = str.charAt(i);

                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||  ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {

                        vowels++;

                    } else {

                        consonants++;
                    }
                }

                i++;
            }

            //  longest word
            String longestWord = words[0];

            i = 1;

            while (i < words.length) {

                if (words[i].length() > longestWord.length()) {

                    longestWord = words[i];
                }

                i++;
            }
            
            

            // Reverse 
            String reversed = "";

            i = str.length() - 1;

            while (i >= 0) {

                reversed = reversed + str.charAt(i);

                i--;
            }

            // Convert to uppercase
            String uppercase = str.toUpperCase();

            
            
            // Display results
        System.out.println("Number of Words: " + wordCount);
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Uppercase:");
        System.out.println(uppercase);
        System.out.println("Reversed:");
         System.out.println(reversed);

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}