public class FindDuplicate{
    public static void main(String args[]){
        int[] arr = {1,2,2,4,5,6,7,8,8};
        boolean isDuplicate = false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
                if(isDuplicate){ 
                    System.out.println("Duplicate found in in array ");
                }else{
                    System.out.println("No diplicate..");
                }
    }
}