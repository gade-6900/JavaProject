public class countOdd{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int coutn =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
                coutn++;
        }
        System.out.println("count of odd number: " + coutn);
    }
}
