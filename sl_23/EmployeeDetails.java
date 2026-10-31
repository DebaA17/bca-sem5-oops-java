import java.util.Scanner;

class Employee {
    String name;
    double salary, pf, allowance;

    Employee() {
        this("Unknown", 0);
    }

    Employee(Object value) {
        this(value instanceof Employee ? ((Employee) value).name : "Unknown",
                value instanceof Employee ? ((Employee) value).salary : 0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        pf = salary * 0.12;
        allowance = salary * 0.20;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, salary);
        Employee result = new Employee(employee);
        result.show();
        scanner.close();
    }
}
