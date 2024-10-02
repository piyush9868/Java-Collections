package Streams.IntermediateOps;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,1,2,5,6,7,5,9};
        Stream<Integer> stream = Arrays.stream(arr).distinct();
        System.out.println(stream.toList());
    }
}
