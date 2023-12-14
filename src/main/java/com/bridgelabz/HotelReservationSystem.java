package com.bridgelabz;

import java.util.ArrayList;
import java.time.*;
import java.time.temporal.*;

/*
*@Desc:HotelReservationSystem class contains a arraylist which stores the hotel names and rates for
 regular customer weekdays Rate and weekend Rate for the customer.
 *chepestHotel() method is to find chepest hotel based on rating.
 * chepestHotelWithRateReating() is to find chepest hotel with best rate and rating.
 */
public class HotelReservationSystem {
    //ArrayList for hotelList.
    static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    //sumWeekdayLakewood is storing a weekday and weekend price for Lakewood hotel
    int sumWeekdayLakewood;
    //sumWeekdayBridgewood is storing a weekday and weekend price for Bridgewood hotel
    int sumWeekdayBridgewood;
    //sumWeekdayRidgewood is storing a weekday and weekend price for Ridgewood hotel
    int sumWeekdayRidgewood;
    //cheapestHotelWithRatingLakewood variable is storing a value for rating
    double cheapestHotelWithRatingLakewood;
    //cheapestHotelWithRatingBridgewood variable is storing a value for rating
    double cheapestHotelWithRatingBridgewood;
    //cheapestHotelWithRatingRidgewood variable is storing a value for rating
    double cheapestHotelWithRatingRidgewood;


    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        Hotel Lakewood = new Hotel("Lakewood", 110, 110, 90, 3);
        Hotel Bridgewood = new Hotel("Bridgewood", 160, 160, 60, 4);
        Hotel Ridgewood = new Hotel("Ridgewood", 220, 220, 150, 5);

        hotelList.add(Lakewood);
        hotelList.add(Bridgewood);
        hotelList.add(Ridgewood);
        System.out.println(hotelList);
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.chepestHotel();
        reservationSystem.chepestHotelWithRateReating();
    }

    /*
     *@Desc: checkWeekday() is method returning true or false if it is a weekday.
     *@param:dayOfWeek is parameter containing a day for the given date
     */
    public static boolean checkWeekday(DayOfWeek dayOfWeek) {
        if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
            return false;
        } else
            return true;
    }

    /*
    *@Desc: chepestHotel() method is converting a given date into a dateformat and
     later it getting a dayOfWeek using a inbuilt function getDayOfWeek() to get the day.
     Calling a checkWeekday() method inside a chepestHotel() method to calculate a weekday rate
     for the each hotel and comparing it to get the chepestHotel.
    *
     */
    public void chepestHotel() {
// create LocalDate object
        LocalDate localDate
                = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate localDate_1
                = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate localdate_2 = LocalDate.of(2020, Month.SEPTEMBER, 12);
        /*
         * DayOfWeek get the day according to provided date in a inputs
         */
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        DayOfWeek dayOfWeek1 = localDate_1.getDayOfWeek();
        DayOfWeek dayOfWeek2 = localdate_2.getDayOfWeek();
        //Calling function checkWeekday() to check the weekday and if it is weekday then adding rates for the dates.
        if (checkWeekday(dayOfWeek) && checkWeekday(dayOfWeek1)) {
            int sum1 = hotelList.get(0).getRatesForRegularCustomer() + hotelList.get(0).getRatesForRegularCustomer();
            int sum2 = hotelList.get(1).getRatesForRegularCustomer() + hotelList.get(1).getRatesForRegularCustomer();
            int sum3 = hotelList.get(2).getRatesForRegularCustomer() + hotelList.get(2).getRatesForRegularCustomer();

            if (sum1 < sum2 && sum1 < sum3) {
                System.out.println("Hotel Lakewood is cheapest for weekdays ");
            } else if (sum2 < sum1 && sum2 < sum3) {
                System.out.println("Hotel Bridgewood is cheapest weekdays ");
            } else {
                System.out.println("Hotel Ridgewood is cheapest weekdays ");
            }

        }
        /*checkWeekday(dayOfWeek1) will return true if it is a weekdays
         *Here storing a weekday rate for each hotel
         */
        if (checkWeekday(dayOfWeek1)) {
            sumWeekdayLakewood = hotelList.get(0).getWeekdaysRateForRegularCustomer();
            sumWeekdayBridgewood = hotelList.get(1).getWeekdaysRateForRegularCustomer();
            sumWeekdayRidgewood = hotelList.get(1).getWeekdaysRateForRegularCustomer();
        }
        /*checkWeekday(dayOfWeek2) will return true if it is a weekdays but here dayOfWeek2 is a weekend.
        Calculating  a weekday and weekend total rate for each hotel
         */
        if (!checkWeekday(dayOfWeek2)) {
            sumWeekdayLakewood = sumWeekdayLakewood + hotelList.get(0).getWeekendRateForregularcustomer();
            sumWeekdayBridgewood = sumWeekdayBridgewood + hotelList.get(1).getWeekendRateForregularcustomer();
            sumWeekdayRidgewood = sumWeekdayRidgewood + hotelList.get(2).getWeekendRateForregularcustomer();


        }
        //To calculate a cheapest hotel for the weekdays and weekend.
        if (sumWeekdayLakewood < sumWeekdayBridgewood && sumWeekdayLakewood < sumWeekdayRidgewood) {
            System.out.println("Cheapest rate for hotel Lakewood in weekend and weekdays is " + sumWeekdayLakewood);
        } else if (sumWeekdayBridgewood < sumWeekdayLakewood && sumWeekdayBridgewood < sumWeekdayRidgewood) {
            System.out.println("Cheapest rate for hotel Bridgewood in weekend and weekdays is " + sumWeekdayBridgewood);
        } else {
            System.out.println("Cheapest rate for hotel Ridgewood in weekend and weekdays is  " + sumWeekdayRidgewood);
        }


    }

    /*
     * chepestHotelWithRateReating() is to find cheap hotel based on the cheap rate and best rating.
     */
    public void chepestHotelWithRateReating() {
        cheapestHotelWithRatingLakewood = sumWeekdayLakewood / hotelList.get(0).getHotelRating();
        cheapestHotelWithRatingBridgewood = sumWeekdayBridgewood / hotelList.get(1).getHotelRating();
        cheapestHotelWithRatingRidgewood = sumWeekdayRidgewood / hotelList.get(2).getHotelRating();

        if (cheapestHotelWithRatingLakewood < cheapestHotelWithRatingBridgewood && cheapestHotelWithRatingLakewood < cheapestHotelWithRatingRidgewood) {
            System.out.println("Hotel Lakewood is best hotel with cheapest rate and best rating " + cheapestHotelWithRatingLakewood);
        } else if (cheapestHotelWithRatingBridgewood < cheapestHotelWithRatingLakewood && cheapestHotelWithRatingBridgewood < cheapestHotelWithRatingRidgewood) {
            System.out.println("Hotel Bridgewood is best hotel with cheapest rate and best rating " + cheapestHotelWithRatingBridgewood);
        } else {
            System.out.println("Hotel Ridgewood is best hotel with cheapest rate and best rating " + cheapestHotelWithRatingRidgewood);
        }
    }

}
