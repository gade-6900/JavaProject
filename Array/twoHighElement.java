import java.util.*;
public class twoHighElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter Array size: ");
        int s = sc.nextInt();

        int[] arr = new int[s];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();   
        }
        System.out.println("\nArray Elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
            
        }

        int first =0;
        int second =0;

        for(int num : arr){
            if(num >first){
                second = first;
                first = num;
            }else if (num > second && num != first) {
                second = num ;
            }
        }
        System.out.println("\n\nFirst Highest: "+first + ",  second highest: "+ second);



    }
}