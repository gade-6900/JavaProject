import java.util.Scanner;

public class FindMax{

    private int[] arr;

    void setArray(int a[]){
        arr = a;
    }
    int getMax(){
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FindMax obj = new FindMax();

        System.out.print("Eneter the Array Size:  ");
        int size = sc.nextInt();

        int[]  num = new int[size];
        System.out.println("Enetre " +  size + " Elements: ");
        for(int i =0;i<size;i++){
            num[i]=sc.nextInt();
        }
        obj.setArray(num);
        int MaxValue = obj.getMax();


        System.out.println(" Maximum number in Array: "+  MaxValue);

    }
}