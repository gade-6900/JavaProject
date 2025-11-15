import java.util.Scanner;
public class FActorialOfElements{

    static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("size: ");
        int n= sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Elemets: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }



        for(int  i=0;i<arr.length;i++){
            arr[i] = factorial(arr[i]);
        }

        System.out.println("output: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }


}