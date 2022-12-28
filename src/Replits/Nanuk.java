package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Nanuk {

    public static void main(String[] args) {

        //nanuk(["1","10","3","nanuk","nanuk","nanuk"],2,7)

        ArrayList<String> result = new ArrayList<>(Arrays.asList("1", "10", "3", "nanuk", "nanuk", "nanuk"));

        boolean hunt = false;
        int wayStones = 3;
        int boast = 7;
        int countNanuk = 0;
        int huntCount = 0;

        for (int i = 0; i < result.size(); i++) {

            if (result.get(i).equals("nanuk")) {
                countNanuk++;
            }
        }

        for (int i = 0; i < countNanuk; i++) {
            result.remove("nanuk");
        }

        for (int i = 0; i < result.size(); i++) {
            huntCount += Integer.parseInt(result.get(i));
        }

        if(countNanuk <= wayStones){
            if(huntCount >= boast){
                hunt = true;
            }
        }
        if(countNanuk < wayStones){
            hunt = false;
        }

        if(countNanuk ==0){
            if(huntCount >= boast ){
                hunt = true;
            }
        }





    }
}


