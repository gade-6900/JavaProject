public class FirstAndLastIndex{
    public static void main(String args[]){
        int arr[] = {2, 4, 4, 4, 6, 7, 9};
        int x =4;

        int low=0;
        int high = arr.length-1;
        int first =-1;
        int last=-1;


        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid]==x){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>x){
                high =mid-1;

            }
            else{
                low=mid+1;
            }
        }
        System.out.println("first: "+first+ " last: "+ last);
    }
}