package Replits;

import java.util.ArrayList;
import java.util.List;

public class CombineArrays {

    public static void main(String[] args) {

        String[] r1 = {"f","o","o"};
        String[] r2 = {" b","a","r"};

        ArrayList<String> list = new ArrayList<>();

        list.addAll(List.of(r1));
        list.addAll(r1.length,List.of(r2));

        System.out.println(list);




    }
}
