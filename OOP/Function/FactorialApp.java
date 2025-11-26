import java.util.*;
public class FactorialApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        int result =getFact(no);
        System.out.println("Factorial is: "+ result);

    }
    public static int getFact(int val){
        int f=1;
        for(int i=1;i<=val;i++){
            f=f*i;
        }
        return f;

    }
}