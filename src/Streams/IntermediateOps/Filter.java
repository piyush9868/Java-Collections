package Streams.IntermediateOps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        //step 1
        Stream<String> stream = Stream.of("Hello", "I'm", "piyush", "soni");

        //step 2
        Stream<String> intermediateStream = stream.filter((String s) -> {
            for(char c : s.toCharArray()){
                if(Character.isUpperCase(c)){
                    return false;
                }
            }
            return true;
        });

        //terminal operation
        List<String> ans = intermediateStream.toList();

        System.out.println(ans);
    }
}
