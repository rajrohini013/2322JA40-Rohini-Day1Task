package day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String[] lines = {
            "This is the first line.",
            "This is the second line.",
            "This is the third line."
        };

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            for (String line : lines) {
                writer.write(line);
                writer.newLine();             }

            writer.close();
            System.out.println("Lines written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
