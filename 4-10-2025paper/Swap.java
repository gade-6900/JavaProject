import java.util.*;
public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5-number: ");
        int num = sc.nextInt();



        if(num < 10000 || num >99999){
            System.out.println("Must Enter 5-digit: ");
            return;
        }
        int f1 = num/10000;
        int s2= (num/1000)%10;
        int t3 = (num /100) %10;
        int f4 = (num/10)%10;
        int f5 = num%10;
        

        int reslt = f4*10000+f5*1000+t3*100+f1*10+s2;
        System.out.println(reslt);
    }
}