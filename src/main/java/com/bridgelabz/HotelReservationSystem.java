package com.bridgelabz;

import java.util.ArrayList;
import java.time.*;
import java.time.temporal.*;
/*
*@Desc:HotelReservationSystem class contains a arraylist which stores the hotel names and rates for
 regular customer and adding it into a list.
 */
public class HotelReservationSystem {
    //ArrayList for hotelList.
   static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        Hotel Lakewood = new Hotel("Lakewood", 110);
        Hotel Bridgewood = new Hotel("Bridgewood", 160);
        Hotel Ridgewood = new Hotel("Ridgewood", 220);

        hotelList.add(Lakewood);
        hotelList.add(Bridgewood);
        hotelList.add(Ridgewood);
        System.out.println(hotelList);
        HotelReservationSystem reservationSystem=new HotelReservationSystem();
        reservationSystem.chepestHotel();

    }
    /*
    *@Desc: chepestHotel() method is converting a given date into a dateformat and
     later it getting a dayOfWeek using a inbuilt function getDayOfWeek() to get the day.
     Calling a checkWeekday() method inside a chepestHotel() method to calculate a weekday rate
     for the each hotel and comparing it to get the chepestHotel.
    *
     */
    public void chepestHotel()
    {
// create LocalDate object
       LocalDate localDate
                = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate localDate_1
                = LocalDate.of(2020, Month.SEPTEMBER, 11);
//        String checkDay= String.valueOf(localDate);
//        String checkDay_1=String.valueOf(localDate_1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        DayOfWeek dayOfWeek1=localDate_1.getDayOfWeek();
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek);
        if(checkWeekday(dayOfWeek) && checkWeekday(dayOfWeek1))
        {
            System.out.println("It is a weekdays");
            int sum1 = hotelList.get(0).getRatesForRegularCustomer() + hotelList.get(0).getRatesForRegularCustomer();
            int sum2 = hotelList.get(1).getRatesForRegularCustomer() + hotelList.get(1).getRatesForRegularCustomer();
            int sum3 = hotelList.get(2).getRatesForRegularCustomer() + hotelList.get(2).getRatesForRegularCustomer();

            if(sum1<sum2 && sum1<sum3) {
                System.out.println("Hotel Lakewood is cheapest ");
            }
            else if (sum2<sum1&&sum2<sum3)
            {
                System.out.println("Hotel Bridgewood is cheapest ");
            }
            else
            {
                System.out.println("Hotel Ridgewood is cheapest ");
            }

        }


    }
    /*
        *@Desc: checkWeekday() is method returning true or false if it is a weekday.
        *@param:dayOfWeek is parameter containing a day for the given date
     */
    public static boolean checkWeekday(DayOfWeek dayOfWeek)
    {
        if( dayOfWeek.equals( DayOfWeek.SATURDAY) || dayOfWeek.equals( DayOfWeek.SUNDAY))
        {
            System.out.println("true");
            return false;
        }
       else
           return true;
    }


}
