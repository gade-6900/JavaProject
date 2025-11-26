public class FindMissingElementsUnsortedArray{
    public static void main(String args[]){

        int[] arr = {7,3,1,2,6};
        int max = 7;

        boolean[] freq = new boolean[max+1];

        for(int i=0;i<arr.length;i++){
         freq[arr[i]] = true;
        }
        System.out.println("Missing: ");
        for(int i = 1; i <= max; i++){
         if(!freq[i]){
         System.out.print( i+ " ");
        }
    } 

    }
}