public class FindPairOfSum{
    public static void main(String args[]){
        int[] arr = {1,5,7,-1,5};
        int sum =6;

        System.out.println("Pair with Sum " + sum + " :");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==sum){
                System.out.println("(" + arr[i]+ "," + arr[j]+ ")");

                }
            }
        }
    }
}