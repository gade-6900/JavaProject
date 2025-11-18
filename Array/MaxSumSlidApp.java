// import java.util.*;
// public class MaxSumSlidApp{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int[] ar = {1,3,2,6,-1,4,1,8,2};
//         int k=3;
//         if(ar.length<3){
//             System.out.println("invalid window size:");
//         }
//         int windowSum =0;
//         for(int i=0;i<k;i++){
//             windowSum = windowSum + ar[i];
//         }
//         int maxSum = windowSum;
//         for(int i=0;i<ar.length;i++){
//             windowSum = windowSum+ar[i]-ar[i-k];

//             if(windowSum>maxSum){
//                 maxSum=windowSum;
//             }
//         }
//         System.out.println("Max Window Sum is: "+  maxSum);
//     }
// }
import java.util.*;
public class MaxSumSlidApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] ar = {1,3,2,6,-1,4,1,8,2};
        int k = 3;

        // Check for valid array and window size
        if (ar.length < k) { // Use k instead of fixed 3
            System.out.println("Invalid array size for window K.");
            return; // Stop execution
        }

        // --- 1. Calculate the initial window sum ---
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + ar[i];
        }

        int maxSum = windowSum;

        // --- 2. Slide the window one element at a time ---
        // 'i' represents the index of the *new element* entering the window.
        // The first new element enters at index k.
        for(int i = k; i < ar.length; i++){
            
            // Add the new element entering the window (ar[i])
            // Subtract the element leaving the window (ar[i-k])
            windowSum = windowSum + ar[i] - ar[i-k]; 

            // Update the maximum sum
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        
        System.out.println("Max Window Sum is: " + maxSum);
    }
}