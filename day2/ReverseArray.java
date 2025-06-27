package day2;

  import java.util.Scanner;
  
public class ReverseArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = Scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Scanner.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        Scanner.close();
    }
}






