package Replits;

public class ReverseString {


    public static void main(String[] args) {

        String input = "java";
        String result = "";

        for (int i = input.length()-1; i >= 0; i--) {

            result += input.charAt(i);

        }

        System.out.println(result);




    }
}