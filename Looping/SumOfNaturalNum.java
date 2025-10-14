import java.util.*;
public class SumOfNaturalNum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum=0;
        int i =1;


        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of natural number from "+ n+ " is "+ sum);
    }
}