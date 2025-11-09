import java.util.*;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isprime = true;

        if(num <=1){
            isprime= false;

        }else{
            for(int i=2;i<=num/2;i++){
                if(num %i ==0){
                    isprime=false;
                    break;  
                }

            }
        }
        if(isprime){
            System.out.println(num + " is prime number..");
        }
        else{
            System.out.println(num + " is not prime number..");
        }
    }
}