package Streams.IntermediateOps;

import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        //step 1
        Stream<String> stream = Stream.of("Hello", "I'm", "piyush", "soni");

        //step 2
        Stream<String> intermediateStream = stream.map((String s) -> {
            String result = "";
            if(Character.isLowerCase(s.charAt(0))){
                char first = Character.toUpperCase(s.charAt(0));
                result = first + s.substring(1);
            }
            else{
                result = s;
            }
            return result;
        });

        //terminal operation
        List<String> ans = intermediateStream.toList();

        System.out.println(ans);
    }
}
