public class RemoveDupliacte{
    public static void main(String args[]){
        int[] Arr ={21,35,35,47,56,68};

        int j=0;

        for(int i=1;i<Arr.length;i++){
            if(Arr[i] != Arr[j]){
                j++;
                int temp = Arr[j];
                Arr[j] = Arr[i];
                Arr[i] = temp;

            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(Arr[i] +" ");
        }
    }
}