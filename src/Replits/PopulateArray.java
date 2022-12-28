package Replits;

import java.util.Arrays;

public class PopulateArray {

    public static void main(String[] args) {

        int n = 10;

        int[] arr = new int[n];

        for (int i = 0, j=1; i < arr.length; i++, j++) {
            arr[i] = j;
        }

        System.out.println(Arrays.toString(arr));




    }
}
