package Streams.IntermediateOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Others {
    public static void main(String[] args) {
        //limit
        List<Integer> lst = Arrays.asList(1,2,7,0,6,8,3);
        System.out.println(lst.stream().limit(4).collect(Collectors.toList()));

        //skip
        System.out.println(lst.stream().skip(4).collect(Collectors.toList()));
    }
}
