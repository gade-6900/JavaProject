import java.util.Scanner;
public class FirstAndLastOcc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter num to search: ");
        int x = sc.nextInt();

        int low= 0,high=n-1;
        int first = -1, last =-1;

        /*---------- find first occurence---------*/
        while(low<=high){
            int mid = (low+high)/2;
        
           if(arr[mid]==x){
            first = mid;
            high = mid-1;
            }
          else if(arr[mid]<x){
            low= mid+1;
          }else{
            high = mid-1;
          }
        }
        /*-----find last occurence---------*/


        high = n-1;
        low=0;
        while(low<= high){
            int mid = (low+high)/2;


            if(arr[mid]==x){
                last =mid;
                low= mid+1;
            }
            else if(arr[mid]<x){
                low= mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(first ==-1){
            System.out.println("Elements not found: ");
        }
        else{
            System.out.println("first = "+ first + ", Last: "+ last);
        }

    }
}