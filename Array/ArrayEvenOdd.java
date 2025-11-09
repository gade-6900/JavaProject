import java.util.Scanner;

public class ArrayEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

        int even=0,odd=0;

        for(int array : arr){
            if(array % 2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even : "+ even);
        System.out.println("Odd : "+ odd);

        
    }
}