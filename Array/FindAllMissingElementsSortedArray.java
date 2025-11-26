public class FindAllMissingElementsSortedArray{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,6,7};

        for(int i=1;i<arr.length;i++){

            if(arr[i]-arr[i-1]>1){
                for(int m =arr[i-1]+1;m<arr[i];m++){
                    System.out.println("Missing element: "+m);
                }
            }
            
        }
    }
}