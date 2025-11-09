import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp =num;
        int sum=0;

        while(temp>0){
            int digit = temp%10;
            sum = sum + (digit*digit*digit);
            temp = temp / 10;
        }
        if(sum == num ){
            System.out.println(num + " is Armstrong number..");
        }
        else{
            System.out.println(num + " is notArmstrong number..");
        }
    }
}