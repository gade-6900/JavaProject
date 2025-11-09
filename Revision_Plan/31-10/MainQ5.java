// Q5: Abstract Student + Interface DisplayStudent
abstract class Student {
    abstract double calculatePercentage();
}

interface DisplayStudent {
    void display();
}

class ExamStudent extends Student implements DisplayStudent {
    String name;
    int totalMarks;
    int obtainedMarks;

    ExamStudent(String name, int totalMarks, int obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    double calculatePercentage() {
        return (obtainedMarks * 100.0) / totalMarks;
    }

    public void display() {
        System.out.println("Student: " + name);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class MainQ5 {
    public static void main(String[] args) {
        DisplayStudent s = new ExamStudent("Shubham", 500, 430);
        s.display();
    }
}

