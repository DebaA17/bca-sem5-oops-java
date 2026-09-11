import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: first = " + first + ", second = " + second);
        scanner.close();
    }
}