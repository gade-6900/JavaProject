import java.util.Scanner;
public class SuareOfSortedArray{
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int a: arr){
            System.out.print(a + " ");
        }

        System.out.println();

        int[] sq = new int[size];
        int left =0;
        int right= size-1;
        int pos = size-1;

        while(left<= right){
            int leftsq = arr[left]* arr[left];
            int rightsq = arr[right]*arr[right];

            if(leftsq > rightsq){
                sq[pos] = leftsq;
                left++;
            }
            pos--;
        }
        System.out.println("Square of array ");
        for(int x:sq){
            System.out.print(x+" ");
        }
    }
}
//leetcode solution 
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];

//         int left =0, right =n-1;
//         int index =n-1;

//         while(left<= right){
//             int leftsq = nums[left]* nums[left];
//             int rightsq = nums[right]*nums[right];

//             if(leftsq > rightsq){
//                 result[index] = leftsq;
//                 left++;
//             }else {
//                 result[index] = rightsq;
//                 right--;
//             }
//             index--;
//         }
//         return result;
//         }
// }

