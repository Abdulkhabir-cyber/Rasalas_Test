package Replits;

public class CountAppearance {

    public static void main(String[] args) {

        String[] arr = {"a","foo","bar","foo","bla"};

        String word = "java";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(word)) {
                count++;
            }

        }

        System.out.println(count);



    }
}
