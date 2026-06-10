package June_2026;

import java.util.Arrays;
import java.util.List;

public class RemoveDulpicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5);
        list.stream().distinct().forEach(System.out::println);
    }
}
