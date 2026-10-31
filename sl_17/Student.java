import java.util.Scanner;

class students {
    String name;
    int roll_no;
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        students s = new students();

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll no: ");
        s.roll_no = sc.nextInt();

        sc.close();

        System.out.println("Name = " + s.name);
        System.out.println("Roll No = " + s.roll_no);
    }
}