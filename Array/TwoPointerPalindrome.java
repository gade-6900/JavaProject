import java.util.*;
public class TwoPointerPalindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left =0;
        int right = arr.length-1;
        boolean isPalindrome = true;

        while(left<right){
            if(arr[left] != arr[right]){
                isPalindrome=false;
                break;
            }   
            left++;
            right--; 
        }
        if(isPalindrome){
            System.out.println("Is Palindrome...");
        }
        else{
            System.out.println("Not palindrome...");
        }

    }
}