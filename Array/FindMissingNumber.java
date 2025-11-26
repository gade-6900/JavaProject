public class FindMissingNumber{
    public static void  main(String args[]){
        int[] arr = {1,2,4,5};
        int n =5;

        int sum = n*(n+1)/2;
        int arSum = 0;

        for(int i=0;i<arr.length;i++){
            arSum = arSum+arr[i];
        }
        int missing = sum - arSum;
        System.out.println("Missing: "+ missing);
    }
}