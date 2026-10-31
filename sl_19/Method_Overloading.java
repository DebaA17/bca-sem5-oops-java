import java.util.Scanner;

class Calculator {
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Enter 2 decimal numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        sc.close();

        System.out.println("Sum of 2 ints = " + calc.addition(a, b));
        System.out.println("Sum of 3 ints = " + calc.addition(a, b, c));
        System.out.println("Sum of 2 doubles = " + calc.addition(x, y));
    }
}