import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        long first = 0;
        long second = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += first;
            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Sum of Fibonacci series: " + sum);
        scanner.close();
    }
}