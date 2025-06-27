package day4;

import java.io.*;
import java.util.*;

public class ResultProcessor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("marks.txt"));
        PrintWriter pw = new PrintWriter("result.txt");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];

            int total = 0;
            for (int i = 1; i < parts.length; i++) {
                total += Integer.parseInt(parts[i]);
            }
            int avg = total / (parts.length - 1);

            pw.println(name + " Total: " + total + " Average: " + avg);
        }

        sc.close();
        pw.close();
        System.out.println("Results written to result.txt");
    }
}
