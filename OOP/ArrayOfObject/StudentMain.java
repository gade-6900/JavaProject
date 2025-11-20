import  java.util.*;
class Student{
    int rollNum;
    String name;
    int m1, m2, m3;
    double avg;
    int total;

    void accpetDetail(){
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter roll number: ");
       rollNum=sc.nextInt();
      sc.nextLine();

      System.out.print("Enter name: ");
       name = sc.nextLine();

       System.out.print("Enter m1 marks: ");
       m1=sc.nextInt();

       System.out.print("Enter m2 marks : ");
       m2 = sc.nextInt();

       System.out.print("Enter m3 marks: ");
       m3=sc.nextInt();
        
    }
    void calculate(){
         total = m1+ m2+ m3;
        avg = total /3.0;

    }
    void display(){
        System.out.println("----------------------------------");
        System.out.println("Roll num " + rollNum);
        System.out.println("Name : "+ name);
        System.out.println("marks: "+ m1 +" ," + m2 +" ," + m3);
        System.out.println("total mmarks: " + total);
        System.out.println("Average is: " + avg);

    }

}
public class StudentMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];

        System.out.println("Enter 5 students: ");
        for(int i=0;i<5;i++){
            s[i] = new Student();   

            System.out.println("\nEnter detail for student "+ (i+1));
            s[i].accpetDetail();
            s[i].calculate();

        }

        System.out.println("------Student report--------");
        for(int i=0;i<5;i++){
            s[i].display();
        }

    }
}