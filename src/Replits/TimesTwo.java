package Replits;

import java.util.ArrayList;

public class TimesTwo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(5);
        nums.add(5);
        nums.add(8);
        nums.add(6);

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }






        System.out.println(nums);



    }
}
