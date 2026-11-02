public class InheritanceDemo {
    static abstract class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        abstract double netSalary();

        abstract void display();
    }

    static class Manager extends Employee {
        Manager(String name, double salary) {
            super(name, salary);
        }

        double netSalary() {
            return salary + salary * 0.20;
        }

        void display() {
            System.out.println("Manager: " + name + ", Net salary: " + netSalary());
        }
    }

    static class Clerk extends Employee {
        Clerk(String name, double salary) {
            super(name, salary);
        }

        double netSalary() {
            return salary + salary * 0.10;
        }

        void display() {
            System.out.println("Clerk: " + name + ", Net salary: " + netSalary());
        }
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Person: " + name);
        }
    }

    static class Politician extends Person {
        Politician(String name) {
            super(name);
        }

        void display() {
            System.out.println("Politician: " + name);
        }
    }

    static class Sportsman extends Person {
        Sportsman(String name) {
            super(name);
        }

        void display() {
            System.out.println("Sportsman: " + name);
        }
    }

    public static void main(String[] args) {
        new Politician("Amit").display();
        new Sportsman("Ravi").display();
        new Manager("Mina", 50000).display();
        new Clerk("Rita", 25000).display();
    }
}
