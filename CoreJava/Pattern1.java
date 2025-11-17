public class Pattern1
{  public static void main(String x[])
   {  int i,j,k;
	  for(i=1; i<=5; i++)
	  {   int count=1;
	     for(j=1,k=1; j<=9; j++)
		 {   
		    if(j==6-i)
			{  System.out.printf("1");
			}
			else if(j==4+i)
			{ System.out.print(" "+1);
			}
			else if(i==5)
			{   if(j%2==1){
				 
		            System.out.printf("%d",++k);
					
			     }
				else{
					System.out.printf(" ");
				}
			}
			else
			{ System.out.printf(" ");
			}
		 }
		 System.out.printf("\n");
	  }
   }
}

