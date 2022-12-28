package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lame_db {
        public static String lameDb(String db, String op, String id, String data) {

            String temp = db;
            ArrayList<String> list = new ArrayList<>( Arrays.asList(db.split("")) );

            if(op.equals("add")) {

                if (id.equals("4")) {
                    list.add("#" + id + data);
                }


                if (id.equals("3")) {
                    int num3 = list.indexOf("3") + 1;
                    list.add(num3, data + "#4");
                }


                if (id.equals("2")) {
                    int num2 = list.indexOf("2") + 1;
                    list.add(num2, data + "#3");
                    list.set(list.indexOf("3"), "4");

                }

                if (id.equals("1")) {
                    int num1 = list.indexOf("1") + 1;
                    list.add(num1, data + "#2");
                    list.set(list.indexOf("3"), "4");
                    list.set(list.indexOf("2"), "3");
                }

            }

            if(op.equals("edit")) {

                if (id.equals("1")) {
                    db = db.substring(db.indexOf("#"));
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                    list.add(0, "1" + data);
                }

                if (id.equals("2")) {
                    db = db.substring(0, db.indexOf("2")) + db.substring(db.indexOf("3"));
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                    list.add(list.indexOf("#") + 1, "2" + data + "#");
                }

                if (id.equals("3")) {
                    db = db.substring(0, db.indexOf("3"));
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                    list.add(list.lastIndexOf("#") + 1, "3" + data);
                }
            }

            if(op.equals("delete")) {

                if (id.equals("1")) {
                    db = db.substring(db.indexOf("#"));
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                }

                if (id.equals("2")) {
                    db = db.substring(0, db.indexOf("2")) + db.substring(db.lastIndexOf("#") + 1);
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                }

                if (id.equals("3")) {
                    db = db.substring(0, db.lastIndexOf("#"));
                    list = new ArrayList<>(Arrays.asList(db.split("")));
                }
            }

            String str = String.join("", list);

            return str;
        }//end lameDb

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

            in.close();
        }

    }

