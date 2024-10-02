package Streams.IntermediateOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );

        Stream<String> intermediate = list.stream().flatMap(
                (List<String> s) -> s.stream()
        ).map((String str) -> str.toLowerCase());

        List<String> lst = intermediate.toList();

        System.out.println(lst);
    }
}
