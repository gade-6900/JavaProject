import java.util.*;
public class ToCheckDuck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:  ");
        int num = sc.nextInt();
        int temp=num;

        boolean isDuck = false;
        while(temp>0){
            int digit = temp % 10;
            if(digit==0){
                isDuck=true;
            }
            temp = temp/10;
        }
        if(isDuck && num!=0){
            System.out.println(num + " is Duck number..");
        }else{
            System.out.println(num + " is not Duck Number....");
        }
        

    }
}