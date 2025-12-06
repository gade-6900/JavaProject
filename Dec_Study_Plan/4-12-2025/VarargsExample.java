import java.util.*;
public class VarargsExample{
    public static void displayName(String ... names){
        for(String myNames : names){
            System.out.println(myNames+" ");
        }
    }
    public static void main(String args[]){
        displayName("Alex","Richard","John");
    }
}