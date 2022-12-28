package Replits;

public class WordCount {

    public static void main(String[] args) {


        String words = "one two three";

        words.trim();
        int count = 0;


        for (int i = 0; i < words.length(); i++) {

            if(words.charAt(i) == ' '){
                count++;
            }
        }
        count = count +1;

        System.out.println( count);





    }


}
