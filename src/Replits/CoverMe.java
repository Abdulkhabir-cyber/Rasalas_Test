package Replits;

public class CoverMe {

    public static void main(String[] args) {

        String str = "Certified Wooden Spoon";
        String ed = "a";


        if(str.contains(ed)){
            str = str.replace(ed, "["+ed+"]");
        }else{
            str = "[" + str + "]";
        }




        System.out.println(str);






    }
}
