package Replits;

import java.util.Arrays;


public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {4,5,6};

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0, j = a.length; i < b.length; i++, j++) {
            result[j] = b[i];
        }

        System.out.println(Arrays.toString(result));


    }
}
