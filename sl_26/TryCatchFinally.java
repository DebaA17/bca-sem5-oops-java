import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            System.out.println("Result: " + numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
            scanner.close();
        }
    }
}
