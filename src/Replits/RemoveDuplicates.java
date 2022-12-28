package Replits;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "spoon";
        String result = "";

        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            if( !(result.contains( arr[i] ))   ){
                result += arr[i];
            }
        }

        System.out.println(result);




    }
}
