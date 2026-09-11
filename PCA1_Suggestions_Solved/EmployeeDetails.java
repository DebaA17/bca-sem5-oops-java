import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee code: ");
        String code = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee gender: ");
        String gender = scanner.nextLine();

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        scanner.close();
    }
}