import java.util.*;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentList{
    public static void main(String[] args) {

        Collection<Student> list = new ArrayList<>();

        list.add(new Student(1,"abc"));
        list.add(new Student(2,"def"));
        list.add(new Student(3,"ghi"));
        list.add(new Student(4,"jkl"));
        list.add(new Student(5,"mno"));
        list.add(new Student(6,"pqr"));
        list.add(new Student(7,"stu"));

        System.out.println("--------------------");

        for(Student s : list){
            System.out.println("ID :- "+ s.id + " Name:- " + s.name);
        }



        
    }
}