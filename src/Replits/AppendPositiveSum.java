package Replits;

import java.util.ArrayList;
import java.util.Arrays;


public class AppendPositiveSum {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

        int count = 0;

        for (Integer each : list) {
            if(each > 0){
                count+=each;
            }
        }

        list.removeIf(p -> p<=0);

        list.add(list.size(), count);

        System.out.println(list);


    }
}
