package day3;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}
