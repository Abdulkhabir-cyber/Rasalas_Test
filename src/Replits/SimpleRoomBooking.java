package Replits;

import java.time.LocalDate;

public class SimpleRoomBooking {

    public static void main(String[] args) {

        boolean isAvailable = false;
        int month = 2;
        int day = 1;
        int year = 2018;

        LocalDate bookingDay = LocalDate.of(year,month,day);

        LocalDate start = LocalDate.of(2018, 7, 1);
        LocalDate end = LocalDate.of(2018, 7, 8);

        if(isAvailable ){

            if( bookingDay.isBefore(start)  ){
                System.out.println(true);
            }else {
                System.out.println(false);
            }

        }else{
            System.out.println(false);
        }




    }
}
