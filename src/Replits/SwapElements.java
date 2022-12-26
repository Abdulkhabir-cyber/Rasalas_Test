package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        //swap(["one","two","three"],0,2);

        int first = 0;
        int second = 2;

        ArrayList<String>  swap = new ArrayList<>(Arrays.asList("one","two","three"));

        String temp = swap.get(0);

        swap.set(0,swap.get(second));
        swap.set(second, temp);

        System.out.println(swap);


    }
}
