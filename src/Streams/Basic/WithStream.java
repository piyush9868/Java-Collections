package Streams.Basic;

import java.util.ArrayList;
import java.util.List;

public class WithStream {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(8000);
        salaryList.add(12000);
        salaryList.add(90000);
        salaryList.add(14000);
        salaryList.add(1000);
        salaryList.add(9000);

        //number of employees who's salary > 10000
        long count = salaryList.stream().filter((Integer s) -> s > 1000).count();
        System.out.println(count);
    }
}
