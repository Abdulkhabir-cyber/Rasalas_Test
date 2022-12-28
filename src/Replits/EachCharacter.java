package Replits;

public class EachCharacter {

    public static void main(String[] args) {

        String str = "appleeess";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j) == ch){
                    count++;
                }
            }

            if( !(result.contains(""+ch)) ){
                result += "" + count + ch;
            }

        }

        System.out.println(result);


    }
}
