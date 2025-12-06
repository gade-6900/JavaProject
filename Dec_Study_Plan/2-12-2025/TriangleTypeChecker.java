import java.util.*;
public class TriangleTypeChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c && c==a){
            System.out.println("Equilateral");
            
        }
        else if(a==b || b==c || c==a){
            System.out.println("Isoscele...");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
