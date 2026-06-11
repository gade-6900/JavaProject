package June_2026;
import java.util.*;
import java.util.*;
public class StartWith{
    public static void main(String[] args){
        List<String> list = Arrays.asList("Amit", "Rohit","Jay","Abhishek","Azar");

        list.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);
    }
} 