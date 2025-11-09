import java.util.Scanner;
class MergeArr{
    private int[] arr1;
    private int[] arr2;

        MergeArr( int[] a, int[] b) {
        this.arr1=a;
        this.arr2=b;

    }
    int[] getMergeArray(){
        int[] merged = new int[arr1.length + arr2.length];

        for(int i=0;i<arr1.length;i++){
            merged[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merged[arr1.length+ i] = arr2[i];
        }
        return merged;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first Array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n1;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second Array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        System.out.println("Enter theArray elements: ");
        for(int i=0;i<n2;i++){
            b[i] = sc.nextInt();
        }
        
        MergeArr obj = new MergeArr(a,b);
        int[] mergedArray = obj.getMergeArray();


        System.out.println(" Merged Array: ");
        for(int num: mergedArray){
            System.out.print(num + " ");
        }
    }
}