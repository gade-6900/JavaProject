public class ReverseString{
    public static void main(String args[]){
        String str = "Hello";

        char[] s = str.toCharArray();
        int left =0;
        int right= s.length-1;

        while(left<right){
            char  temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        String reversed =new String(s);
        System.out.print("Reversed String is: "+ reversed);
    }
    
}