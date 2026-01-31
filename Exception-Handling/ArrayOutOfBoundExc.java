public class ArrayOutOfBoundExc {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        try{
            System.out.println(arr[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is Out of Bound");
        } 
    }
}
