import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int rem = n%2;
        if(rem==0){
            System.out.println(n +" The number is Even. ");
        }else{
            System.out.println(n+" The number is Odd..");
        }
    }
}