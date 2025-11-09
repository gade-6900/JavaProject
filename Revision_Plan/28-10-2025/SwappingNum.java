import java.util.*;
public class SwappingNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second value: ");
        int num2= sc.nextInt();

        System.out.println("BEfore Swaooing: "+ num1 + " " + num2);

        int temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("after swapping : " + "a = "+ num1 + " " + "b = "+ num2);
    }
}