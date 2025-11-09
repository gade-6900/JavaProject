import java.util.Scanner;
public class sortArray{
     public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i,j,temp;
	int a[]=new int[8];
	
	System.out.println("Enter Array elemnts:" );
		for(i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		 
		 for(i=0;i<a.length;i++){
			for(j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
	    }
        System.out.println("Sotred Array is: ");
					for(i=0;i<a.length;i++){
					System.out.printf("\t%d",a[i]);
                    }
	
	}
}	
	


   	