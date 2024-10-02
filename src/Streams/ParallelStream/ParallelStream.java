package Streams.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        List<Integer> lst = Arrays.asList(1,7,3,4,6,7,8,9,1,1,7,3,4,6,7,8,9,1,1,7,3,4,6,7,8,9,1,1,7,3,4,6,7,8,9,1,1,7,3,4,6,7,8,9,1);
        lst.parallelStream()
                .filter((Integer ele) -> ele > 3)
                .sorted()
                .forEach((Integer ele) -> System.out.println(ele));
        System.out.println("Time taken: " + (System.currentTimeMillis() - beforeTime) );
    }
}
