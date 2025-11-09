// Q2: Abstract class + Interface
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double bonus();
}

interface Printable {
    void printDetails();
}

class Manager extends Employee implements Printable {
    Manager(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return salary * 0.20;
    }

    public void printDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus());
    }
}

public class MainQ2 {
    public static void main(String[] args) {
        Printable m = new Manager("Shubham", 50000);
        m.printDetails();
    }
}
