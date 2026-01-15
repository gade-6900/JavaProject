import java.util.*;
public class ArithmeticExceptionApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Number");
        a=sc.nextInt();
        b=sc.nextInt();

        try{
            c= a/b;
            System.out.println("Division is: "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("error is "+e);
        }
        System.out.println("Logic1: ");
        System.out.println("Logic 2: ");
        System.out.println("Logic 3: ");
        

    }
}