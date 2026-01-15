public class FindMin{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min Elemenet is : " + min);
    }
}