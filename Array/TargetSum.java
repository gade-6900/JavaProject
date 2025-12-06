import java.util.*;
public class TargetSum{
    public static  void  main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int size = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean found =false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(arr[i]+ arr[j]==target){
                    System.out.println("Pair found " + arr[i]+ " + "+ arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("PAir not found in the array ...");
        }

    }
}