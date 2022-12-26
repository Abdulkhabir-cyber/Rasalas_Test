package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Fuel {

    public static void main(String[] args) {

        ArrayList<Integer> deliveries = new ArrayList<>(Arrays.asList(9,1));

        int gasTank = 3;
        int count = 0;
        int result = 0;

        for (Integer each : deliveries) {
            count += each;
        }

        if(count % gasTank !=0){
            result = count / gasTank + 1;
        }else{
            result = count / gasTank;
        }

        System.out.println(result);


    }
}
