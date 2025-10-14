import java.util.*;
public class SimpleIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first vale: ");
        int a = sc.nextInt();
        System.out.println("Enter second val: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Bothe are same : ");
        }
        if(a>b){
            System.out.println("A is gresther than B");

        }if(b>a){
            System.out.println("B is greater than A: ");
        }

    }
}