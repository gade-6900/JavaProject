import java.util.*;
public class CompareThreeNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c && c == a){
            System.out.println("All Equal..");
        }else if(a != b && b!=c && a!=c){
            System.out.println("All different.");
        }
        else{
            System.out.println("Neither.");
        }

    }
}