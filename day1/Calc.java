package day1;

import java.util.*;

public class Calc {
    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return b != 0 ? a / b : 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ch;
        System.out.print("1.Add 2.Sub 3.Mul 4.Div\nEnter choice: ");
        ch = sc.nextInt();
        System.out.print("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch(ch) {
            case 1: System.out.println("Result: " + add(a, b)); break;
            case 2: System.out.println("Result: " + sub(a, b)); break;
            case 3: System.out.println("Result: " + mul(a, b)); break;
            case 4: System.out.println(b != 0 ? "Result: " + div(a, b) : "Can't divide by 0"); break;
            default: System.out.println("Invalid");
        }
        sc.close();
    }
}
