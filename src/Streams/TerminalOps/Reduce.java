package Streams.TerminalOps;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Long[] arr = {1L,2L,3L,1L,2L,5L,6L,7L,5L,9L};

        //descending using comparator
        Stream<Long> stream = Arrays.stream(arr).sorted((Long i1, Long i2) -> Math.toIntExact(i2 - i1));
        Optional<Long> opt = stream.reduce((Long i1, Long i2) -> i1*i2);
        System.out.println(opt.get());
    }
}
