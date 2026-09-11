import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        if (first > second) {
            System.out.println(first + " is greater.");
        } else if (second > first) {
            System.out.println(second + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}