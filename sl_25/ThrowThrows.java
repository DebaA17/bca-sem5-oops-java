import java.util.Scanner;

public class ThrowThrows {
    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote");
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        scanner.close();
    }
}
