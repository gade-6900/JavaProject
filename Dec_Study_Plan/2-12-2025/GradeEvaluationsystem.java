import java.util.*;
public class GradeEvaluationsystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks: ");
        int mark = sc.nextInt();
        if(mark <0 || mark > 100){
            System.out.println("Invalid marks");

        }
        else if(mark >= 90){
            System.out.println("You have got Garde A:");
        }
        else if(mark >=80){
            System.out.println("B grade: ");
        }
        else if(mark >=70){
            System.out.println("C grade");
        }
        else if(mark>=60){
            System.out.println("D grade.");
        }
        else{
            System.out.println("I think you are Faild..");
        }
    }
}