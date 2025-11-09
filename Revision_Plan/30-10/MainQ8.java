// Q8: Student, Result
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Result extends Student {
    Result(String name, int marks) {
        super(name, marks);
    }

    String getGrade() {
        if (marks >= 75)
            return "A Grade";
        else if (marks >= 50)
            return "B Grade";
        else
            return "Fail";
    }
}

public class MainQ8 {
    public static void main(String[] args) {
        Result r1 = new Result("Shubham", 82);
        System.out.println(r1.name + " has " + r1.getGrade());
    }
}
