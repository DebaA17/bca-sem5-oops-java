import java.util.Scanner;

public class ShiftOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiply by 4: " + (n << 2));
        System.out.println("Divide by 4: " + (n >> 2));
        sc.close();
    }
}