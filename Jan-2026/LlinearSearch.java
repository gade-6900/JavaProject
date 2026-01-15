public class LlinearSearch{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key= 50;
        boolean isfound = false;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                isfound = true;
                break;
            }
        }
            if(isfound){
                System.out.println("Key Found in array ");
            }else{
                System.out.println("Key not found in array..");
            
        }
    }
}