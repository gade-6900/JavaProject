import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f1=0,f2=1,limit,i,fib;

        System.out.print("Enter Limit.. ");
        limit=sc.nextInt();

        System.out.print("Enter Number to check is present in fibonacci.. ");
        int skey = sc.nextInt();

        
        System.out.println(f1+f2);

        i=1;
        boolean flag = false;

        while(i<limit){
            fib=f1+f2;
            if(fib==skey){
                flag=true;
            }
            f1=f2;
            f2=fib;
            i++;
            System.out.println(fib);

        }
        if(flag){
            System.out.println("number present in fibonacci....");
        }else{
            System.out.println("number is not present in fionacci........");
        }

    }
}