import java.util.*;
public class VewelOrConsonent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter charactor: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        

        if(ch =='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch + " is Vowel: ");
        }else{
            System.out.println(ch +" this is the consonent..");
        }

    }
}