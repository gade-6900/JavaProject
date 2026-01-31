import java.util.Scanner;

public class CatchWithout {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two values: ");
            int a = sc.nextInt();
            int b=sc.nextInt();
            int c = a/b;
            System.out.println("Result is : " +c);
        }
        finally{
            System.out.println("i am executed");
        }
    }
}
