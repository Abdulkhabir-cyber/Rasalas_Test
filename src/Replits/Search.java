package Replits;

import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {

        //search(["one apple","two orange","four banana"],"four")
        // 4, lea, led, mop, lead, make

        ArrayList<String> strs = new ArrayList<>();

        strs.add("led");
        strs.add("mop");
        strs.add("lead");
        strs.add("make");

        String temp = "";

        String find = "lea";


        System.out.println(strs);


        for (int i = 0; i < strs.size(); i++) {

            if (  strs.get(i).contains(find)   ) {
                temp = strs.get(i);
                break;
            }else {
                temp = "search failed";
            }
        }



        System.out.println(temp);




    }
}
