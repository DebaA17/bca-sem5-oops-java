import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swapping: first = " + first + ", second = " + second);
        scanner.close();
    }
}