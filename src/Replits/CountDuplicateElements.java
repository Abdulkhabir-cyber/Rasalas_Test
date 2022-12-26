package Replits;

import java.util.ArrayList;

public class CountDuplicateElements {

    public static void main(String[] args) {


        String [] arr = {"1","2","aa","1"};
        ArrayList<Integer> supercount = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            String w = arr[i];

            for (int j = 0; j < arr.length; j++) {


                if(arr[j].equals(w)){
                    count++;
                }

            }
            supercount.add(count);

        }

        for (Integer each : supercount) {
            if(each > 1){
                result++;
            }
        }

        System.out.println(supercount);

        System.out.println(result);



    }
}
