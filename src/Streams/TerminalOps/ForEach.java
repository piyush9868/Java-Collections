package Streams.TerminalOps;

import java.util.Arrays;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,1,2,5,6,7,5,9};

        //descending using comparator
        Stream<Integer> stream = Arrays.stream(arr).sorted((Integer i1, Integer i2) -> i2-i1);
        stream.forEach((Integer e) -> System.out.println(e));
    }
}
