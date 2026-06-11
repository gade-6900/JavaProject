package June_2026;
import java.util.*;
public class Sap{
    public static void main(String[] args){
       Optional<String> name = Optional.of("shubham");
       Optional<String> upper = name.map(String::toUpperCase);
       System.out.println(upper.get());
    }
}