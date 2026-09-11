import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int firstValue = Math.abs(first);
        int secondValue = Math.abs(second);
        int a = firstValue;
        int b = secondValue;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int lcm = (firstValue == 0 || secondValue == 0) ? 0 : (firstValue / a) * secondValue;
        System.out.println("LCM: " + lcm);
        scanner.close();
    }
}