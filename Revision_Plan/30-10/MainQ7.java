// Q7: Runtime Polymorphism
class Person {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getDetails() {
        System.out.println("Person details");
    }
}

class Student extends Person {
    @Override
    void getDetails() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    @Override
    void getDetails() {
        System.out.println("Teacher Name: " + name + ", Age: " + age);
    }
}

public class MainQ7 {
    public static void main(String[] args) {
        Person p;

        p = new Student();
        p.setDetails("Ravi", 20);
        p.getDetails();

        p = new Teacher();
        p.setDetails("Meena", 35);
        p.getDetails();
    }
}
