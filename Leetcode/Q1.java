
import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter array elemets: ");
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int[] result = towSum(num,target);

        System.out.println(" the index of sum is : "+result[0]+ " "+ result[1]);
    }
    public static int[] towSum(int[] num , int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }   
}