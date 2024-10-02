package Streams.IntermediateOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class mapTo {
    public static void main(String[] args) {
        double[] arrDouble = {1.3, 7.1, 8.9, 12.0};
        DoubleStream ds = Arrays.stream(arrDouble);

        List<String> numbers = Arrays.asList("2","1","4");
        IntStream is = numbers.stream().mapToInt((String s) -> Integer.parseInt(s)).sorted();
        System.out.println(Arrays.toString(is.toArray()));
    }
}
