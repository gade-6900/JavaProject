package June_2026;

import java.util.*;
public class EvenNumUseStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,12,20,30,4,5,60,70);
        list.stream().filter(n -> n % 2==0).forEach(System.out::println);
    }
}

