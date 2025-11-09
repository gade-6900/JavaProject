public class MajorityElements{
    public static void main(String args[]){

        int[] arr={2,2,1,1,2,2,2};
        int n = arr.length;

        int candidate =0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
                
            }
            else if (arr[i]==candidate){
                count++;

            }else{
                count--;
            }
        
          }
          count=0;
        for(int i=0;i<n;i++){
            if(arr[i]== candidate){
                count++;
            }

        }
        if(count >n/2){
            System.out.println("Majority elements: " + candidate);
        }else{
            System.out.println("No majority elements: ");
        }

              
        
     }
}
