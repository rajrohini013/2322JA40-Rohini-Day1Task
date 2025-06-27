package day2;

import java.util.Scanner;

public class SimpleAddressbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[2];
        String[] phones = new String[2];
        String[] emails = new String[2];

            for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for contact " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Phone: ");
            phones[i] = scanner.nextLine();
            System.out.print("Email: ");
            emails[i] = scanner.nextLine();
            System.out.println();
        }

            System.out.println("Saved Contacts:");
            for (int i = 0; i < 2; i++) {
            System.out.println("Contact " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Phone: " + phones[i]);
            System.out.println("Email: " + emails[i]);
            System.out.println();
        }

        scanner.close();
    }
}
