package Streams.TerminalOps;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,1,2,5,6,7,5,9};

        //descending using comparator
        Stream<Integer> stream = Arrays.stream(arr).sorted((Integer i1, Integer i2) -> i2-i1);

        System.out.println(Arrays.toString(stream.toArray()));
    }
}
