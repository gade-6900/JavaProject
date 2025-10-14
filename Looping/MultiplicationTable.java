import java.util.*;
public class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print multiplication table: ");
        int n = sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(n+ " x "+ i + " = " +(n*i));
            i++;
        }

    }
}