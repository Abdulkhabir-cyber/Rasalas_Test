package Replits;
import java.util.ArrayList;
import java.util.Arrays;

public class Lame_db_2 {

    public static void main(String[] args) {

        String db = "1etsy#2wooden#3spoon";

        String op = "add";
        String id = "4";
        String data = "aaa";

        String [] dbArray = db.split("#");

        System.out.println(Arrays.toString(dbArray));
        String result = "";
        int index = Integer.parseInt(id);

        switch(op){
            case "add":
                ArrayList<String> dbList = new ArrayList<>( Arrays.asList(dbArray));
                dbList.add(index-1," "+data);

                for(int i = 0; i<dbList.size(); i++){
                    result += (i+1)+dbList.get(i).substring(1);
                    if(i<dbList.size()-1){
                        result+="#";
                    }
                }
                break;

            case "edit":
                ArrayList<String> dbList1 = new ArrayList<>(Arrays.asList(dbArray));
                dbList1.set(index-1," "+data);
                for(int i = 0; i<dbList1.size(); i++){
                    result += (i+1)+dbList1.get(i).substring(1);
                    if(i<dbList1.size()-1){
                        result+="#";
                    }
                }
                break;

            case "delete":
                ArrayList<String> dbList2 = new ArrayList<>(Arrays.asList(dbArray));
                dbList2.remove(index-1);
                for(int i = 0; i<dbList2.size(); i++){
                    result += dbList2.get(i);
                    if(i<dbList2.size()-1){
                        result+="#";
                    }
                }
                if(index == 1){
                    result = "#"+result;
                }
                break;
        }

        System.out.println(result);






    }


}
