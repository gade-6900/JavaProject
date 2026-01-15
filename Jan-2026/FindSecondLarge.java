public class FindSecondLarge{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int large =-1;
        int second =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second = large;
                large = arr[i];
            }
        }
        System.out.println("Second large: "+ second);
    }
}