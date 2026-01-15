import java.util.*;
public class StringNew{  
    public static void main(String []args){
       Scanner sc= new Scanner(System.in);
 
        // for(int i=str.length()-1;i>=0;i--){
        //     System.err.print(str.charAt(i));
        // }


        // char[] arr = str.toCharArray();
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]);
        // }

        // String rev = "";

        // for(int i=str.length()-1;i>=0;i--){
        //     rev = rev+str.charAt(i);
        // }
        // System.out.println(rev);



        System.out.print("Enter String : ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        int start =0;
        int end = arr.length-1;

        while(start < end){
            char temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.print(new String(arr));





    }
}