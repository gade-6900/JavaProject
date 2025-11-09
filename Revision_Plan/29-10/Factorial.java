import java.util.*;
public class Factorial{

    private int num;

    void setValue(int x){
        num=x;
    }
    int getFactorial(){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    Factorial f = new Factorial();

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    f.setValue(n);

    int result = f.getFactorial();

    System.out.println("factorial of : "+ n + " is : " + result);






    }

}