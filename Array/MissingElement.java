import java.util.Scanner;
public class MissingElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        


        int[] arr = new int[n];
        System.out.print("Enetr elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int diff = arr[0] - 0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]-i >diff){
                System.out.println("Missing number: "+(i+diff));
                diff++;
            }
        }



    }
}