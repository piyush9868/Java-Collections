package Streams.IntermediateOps;

import java.util.Arrays;
import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 1, 2, 5, 6, 7, 5, 9};
        Stream<Integer> stream = Arrays.stream(arr)
                .filter((Integer i) -> i > 2)
                .sorted((Integer val1, Integer val2) -> val2 - val1)
                .peek(System.out::println)
                .map((Integer i2) -> -1 * i2);
        System.out.println(stream.toList());
    }

}
