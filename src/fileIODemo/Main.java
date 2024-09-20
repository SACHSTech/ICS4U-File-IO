package fileIODemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        displayWords("src/fileIODemo/words.txt");
    }


    public static void displayWords(String filename) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String word;

            // Read each line (word) from the file
            while ((word = reader.readLine()) != null) {
                System.out.println(word);  // Print each word (line) to the console
            }
        } finally {
            if (reader != null) {
                reader.close();  // Ensure the reader is closed
            }
        }
    }
}