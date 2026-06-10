package June_2026;

import java.util.Arrays;
import java.util.List;

public class FilterData {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        list.stream().filter(n -> n >30).forEach(System.out::println);
    }
}
