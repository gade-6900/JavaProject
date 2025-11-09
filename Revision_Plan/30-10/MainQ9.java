// Q9: Constructor chaining
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class MainQ9 {
    public static void main(String[] args) {
        Employee e = new Employee("Shubham", 24, 55000);
        e.displayDetails();
    }
}
