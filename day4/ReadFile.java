package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");  
            Scanner scanner = new Scanner(file);

            System.out.println("File content:");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);  
            }

            scanner.close();  
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
