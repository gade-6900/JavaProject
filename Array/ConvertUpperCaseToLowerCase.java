import java.util.*;
public class ConvertUpperCaseToLowerCase{
    public static void main(String args[]){
        Scanner xyz  = new Scanner(System.in);
		char ch[]=new char[5];
	   System.out.println("Enter data in character array");
	    for(int i=0; i<ch.length; i++){
		   ch[i]=xyz.nextLine().charAt(0);
		}
		System.out.println("Display array before convert");
		for(int i=0; i<ch.length; i++){
               System.out.printf("%4c",ch[i]);
	        
               if(ch[i]>='a' && ch[i]<='z'){
			  ch[i]=(char)((int)ch[i]-32);
			}
		}
		System.out.println("\nDisplay array after conversion");
		for(int i=0; i<ch.length; i++){
            System.out.printf("%4c",ch[i]);
		}

    }
}