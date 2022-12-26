package Replits;

public class ExtractNumber {

    public static void main(String[] args) {

        String str = "aa2aa3";
        String digits = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                digits += "" + ch;
            }
        }

        System.out.println(digits);





    }
}
