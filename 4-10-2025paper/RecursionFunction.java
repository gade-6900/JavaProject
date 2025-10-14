
import java.util.*;
public class RecursionFunction{


    public  static void Series(int current, int diff, int n){
        if(n==0)
        return ;

        System.out.print(current + " ");

        Series(current + diff , diff +2 , n-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term 1, number term n difference: ");
        int first = 7;

        int n = 8;
        int diff = 3;

        Series(first,diff,n);




    }
}