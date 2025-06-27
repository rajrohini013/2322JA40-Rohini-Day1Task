package day5;

import java.util.*;
import java.io.*;

public class StudentManagementApp {
    static ArrayList<String> studentNames = new ArrayList<>();
    static HashMap<Integer, ArrayList<String>> studentCourses = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Student and Courses");
            System.out.println("2. Search Student Courses");
            System.out.println("3. Delete Student");
            System.out.println("4. Delete Course");
            System.out.println("5. Save Courses to File");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent(sc);
                case 2 -> searchStudent(sc);
                case 3 -> deleteStudent(sc);
                case 4 -> deleteCourse(sc);
                case 5 -> saveToFile();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    static void addStudent(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        studentNames.add(name);
        ArrayList<String> courses = new ArrayList<>();
        String course;
        while (true) {
            System.out.print("Enter course name (or 'done'): ");
            course = sc.nextLine();
            if (course.equalsIgnoreCase("done")) break;
            courses.add(course);
        }
        studentCourses.put(id, courses);
        System.out.println("Student added.");
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        if (studentCourses.containsKey(id)) {
            System.out.println("Courses: " + studentCourses.get(id));
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent(Scanner sc) {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        if (studentCourses.remove(id) != null) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteCourse(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        if (studentCourses.containsKey(id)) {
            System.out.print("Enter course to remove: ");
            String course = sc.nextLine();
            if (studentCourses.get(id).remove(course)) {
                System.out.println("Course removed.");
            } else {
                System.out.println("Course not found.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    static void saveToFile() {
        try {
            FileWriter fw = new FileWriter("a.txt");
            for (Map.Entry<Integer, ArrayList<String>> entry : studentCourses.entrySet()) {
                fw.write("ID: " + entry.getKey() + " Courses: " + entry.getValue() + "\n");
            }
            fw.close();
            System.out.println("Courses saved to a.txt");
        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}
