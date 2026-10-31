import java.util.Scanner;

class Addition {
    Addition(int a, int b) {
        System.out.println("Sum of 2 ints = " + (a + b));
    }

    Addition(int a, int b, int c) {
        System.out.println("Sum of 3 ints = " + (a + b + c));
    }

    Addition(double a, double b) {
        System.out.println("Sum of 2 doubles = " + (a + b));
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Enter 2 decimal numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        sc.close();

        new Addition(a, b);
        new Addition(a, b, c);
        new Addition(x, y);
    }
}