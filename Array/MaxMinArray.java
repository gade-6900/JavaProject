public class MaxMinArray{
    public static void main(String args[]){
        int[] arr = {1,2,3,19,-100,5};

        int max= 0;
        int min=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Max is: "+ max);
        System.out.println("Min is: "+ min);
    }
}