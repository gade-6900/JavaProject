import java.util.Scanner;
public class ComparetwoString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.next();
        System.out.print("Enter second String: ");
        String s2 = sc.next();

        for(int i=0;i<s1.length() && i<s2.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
             System.out.println("String are not equal");
                return;
            } 
        }    
        if(s1.contains(s2)){
            System.out.println("String are equal");
        }
    }
    
}
//if i want write code without inbulid function *//
/*public class ComparetwoString {   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.next();
        System.out.print("Enter second String: ");
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("String are not equal");
            return;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
             System.out.println("String are not equal");
                return;
            } 
        }    
        System.out.println("String are equal");
    }
    
}*/    
