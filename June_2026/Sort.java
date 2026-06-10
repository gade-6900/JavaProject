package June_2026;

import java.util.Arrays;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,7,6,3,4,5,8,10,9);

        list.stream().sorted().forEach(System.out::println);
    }
}
