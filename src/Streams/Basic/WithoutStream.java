package Streams.Basic;

import java.util.ArrayList;
import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(8000);
        salaryList.add(12000);
        salaryList.add(90000);
        salaryList.add(14000);
        salaryList.add(1000);
        salaryList.add(9000);

        //number of employees whos salary > 10000
        int count = 0;
        for(int s : salaryList)
        {
            if(s > 10000)
                count++;
        }
        System.out.println(count);
    }
}
