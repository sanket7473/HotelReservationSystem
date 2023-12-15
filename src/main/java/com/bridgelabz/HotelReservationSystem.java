package com.bridgelabz;

import java.util.ArrayList;
import java.time.*;
import java.time.temporal.*;

/*
*@Desc:HotelReservationSystem class contains a arraylist which stores the hotel names and rates for
 regular customer weekdays Rate and weekend Rate for the customer.
 *chepestHotel() method is to find chepest hotel based on rating.
 * chepestHotelWithRateReating() is to find chepest hotel with best rate and rating.
 * bestRatedHotel() is to find best hotel with good ratings.
 * cheapHotelForRewardCustomerwithRating() method to calculate a best rated hotel for reward customer and
  with cheap price
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
    //ratings for the lakewwod hotel
    int lakeWoodRating;
    // rating for the Bridgewood hotel
    int bridgewoodRating;
    //Rating for Ridgewood hotel
    int ridgewoodRating;

    int sumWeekdayLakewoodForRewardCustomer;
    int sumWeekdayBridgewoodForRewardCustomer;
    int sumWeekdayRidgewoodForRewardCustomer;

    int cheapHotelRewardCustomer_lakewood;
    int cheapHotelForRewardCustomer_bridgewood;
    int cheapHotelForRewardCustomer_ridgewood;

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        Hotel Lakewood = new Hotel("Lakewood", 110, 110, 90, 3, 80, 80);
        Hotel Bridgewood = new Hotel("Bridgewood", 160, 160, 60, 4, 110, 50);
        Hotel Ridgewood = new Hotel("Ridgewood", 220, 220, 150, 5, 100, 40);

        hotelList.add(Lakewood);
        hotelList.add(Bridgewood);
        hotelList.add(Ridgewood);
        System.out.println(hotelList);
        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.chepestHotel();
        reservationSystem.chepestHotelWithRateReating();
        reservationSystem.bestRatedHotel();
        reservationSystem.cheapHotelForRewardCustomer();
        reservationSystem.cheapHotelForRewardCustomerwithRating();
    }

        // create LocalDate object and calculations of the day according to the date.
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
            sumWeekdayRidgewood = hotelList.get(2).getWeekdaysRateForRegularCustomer();
        }
        /*checkWeekday(dayOfWeek2) will return true if it is a weekdays but here dayOfWeek2 is a weekend.
        Calculating  a weekday and weekend total rate for each hotel
         */
        if (!checkWeekday(dayOfWeek2)) {
            sumWeekdayLakewood = sumWeekdayLakewood + hotelList.get(0).getWeekendRateForregularcustomer();
            sumWeekdayBridgewood = sumWeekdayBridgewood + hotelList.get(1).getWeekendRateForregularcustomer();
            sumWeekdayRidgewood = sumWeekdayRidgewood + hotelList.get(2).getWeekendRateForregularcustomer();


        }



        /*To calculate a cheapest hotel
        for the weekdays and weekend.*/

        if (sumWeekdayLakewood < sumWeekdayBridgewood && sumWeekdayLakewood < sumWeekdayRidgewood) {
            System.out.println("Cheapest rate for hotel Lakewood in weekend and weekdays is " + sumWeekdayLakewood);
        } else if (sumWeekdayBridgewood < sumWeekdayLakewood && sumWeekdayBridgewood < sumWeekdayRidgewood) {
            System.out.println("Cheapest rate for hotel Bridgewood in weekend and weekdays is " + sumWeekdayBridgewood);
        } else {
            System.out.println("Cheapest rate for hotel Ridgewood in weekend and weekdays is  " + sumWeekdayRidgewood);
        }


    }

    /*
     * chepestHotelWithRateReating() is to find
       cheap hotel based on the cheap rate and best rating.
     */
    public void chepestHotelWithRateReating() {
        cheapestHotelWithRatingLakewood = sumWeekdayLakewood / hotelList.get(0).getHotelRating();
        cheapestHotelWithRatingBridgewood = sumWeekdayBridgewood / hotelList.get(1).getHotelRating();
        cheapestHotelWithRatingRidgewood = sumWeekdayRidgewood / hotelList.get(2).getHotelRating();

        if (cheapestHotelWithRatingLakewood < cheapestHotelWithRatingBridgewood && cheapestHotelWithRatingLakewood < cheapestHotelWithRatingRidgewood) {
            System.out.println("Hotel Lakewood is best hotel with cheapest rate is " + sumWeekdayLakewood + " and best rating " + hotelList.get(0).getHotelRating());
        } else if (cheapestHotelWithRatingBridgewood < cheapestHotelWithRatingLakewood && cheapestHotelWithRatingBridgewood < cheapestHotelWithRatingRidgewood) {
            System.out.println("Hotel Bridgewood is best hotel with cheapest rate is " + sumWeekdayBridgewood + " and best rating " + hotelList.get(1).getHotelRating());
        } else {
            System.out.println("Hotel Ridgewood is besthotel with cheapest rate is " + sumWeekdayRidgewood + " and best rating and best rating " + hotelList.get(2).getHotelRating());
        }
    }

    /*
    @Desc: bestRatedHotel() is to get the best hotel according to the ratings
     */
    public void bestRatedHotel() {
        lakeWoodRating = hotelList.get(0).getHotelRating();
        bridgewoodRating = hotelList.get(1).getHotelRating();
        ridgewoodRating = hotelList.get(2).getHotelRating();
        if (lakeWoodRating > bridgewoodRating && lakeWoodRating > ridgewoodRating) {
            System.out.println("Best rated hotel is " + hotelList.get(0).getHotelName() + " has Rating " + lakeWoodRating + " and total cost is " + sumWeekdayLakewood);

        } else if (bridgewoodRating > lakeWoodRating && bridgewoodRating > ridgewoodRating) {
            System.out.println("Best rated hotel is " + hotelList.get(1).getHotelName() + " has Rating " + bridgewoodRating + " and total cost is " + sumWeekdayBridgewood);

        } else {
            System.out.println("Best rated hotel is " + hotelList.get(2).getHotelName() + " has Rating " + ridgewoodRating + " and total cost is " + sumWeekdayRidgewood);

        }

    }

    /*
     *
     */
    public void cheapHotelForRewardCustomer() {
        if (sumWeekdayLakewoodForRewardCustomer < sumWeekdayBridgewoodForRewardCustomer && sumWeekdayLakewoodForRewardCustomer < sumWeekdayRidgewoodForRewardCustomer) {
            System.out.println("Chepest hotel for reward customer is " + hotelList.get(0).getHotelName() + " has total rate " + sumWeekdayLakewoodForRewardCustomer);
        } else if (sumWeekdayBridgewoodForRewardCustomer < sumWeekdayLakewoodForRewardCustomer && sumWeekdayBridgewoodForRewardCustomer < sumWeekdayRidgewoodForRewardCustomer) {
            System.out.println("Chepest hotel for reward customer is " + hotelList.get(1).getHotelName() + " has total rate " + sumWeekdayBridgewoodForRewardCustomer);
        } else {
            System.out.println("Chepest hotel for reward customer is " + hotelList.get(2).getHotelName() + " has total rate " + sumWeekdayRidgewoodForRewardCustomer);
        }


    }
/*
*cheapHotelForRewardCustomerwithRating() is to calculate a
 best rated hotel with cheap price and more ratings.
 */
    public void cheapHotelForRewardCustomerwithRating() {
        /* To calculate a cheapest hotel for the
        weekdays and weekend
        for the Reward Customer.
         */
        if (checkWeekday(dayOfWeek1)) {
            sumWeekdayLakewoodForRewardCustomer = hotelList.get(0).weekdaysRateForRewardcustomer;
            sumWeekdayBridgewoodForRewardCustomer = hotelList.get(1).weekdaysRateForRewardcustomer;
            sumWeekdayRidgewoodForRewardCustomer = hotelList.get(2).weekdaysRateForRewardcustomer;

        }
        if (!checkWeekday(dayOfWeek2)) {
            sumWeekdayLakewoodForRewardCustomer = sumWeekdayLakewoodForRewardCustomer + hotelList.get(0).weekendRateForRewardCustomer;
            sumWeekdayBridgewoodForRewardCustomer = sumWeekdayBridgewoodForRewardCustomer + hotelList.get(1).weekendRateForRewardCustomer;
            sumWeekdayRidgewoodForRewardCustomer = sumWeekdayRidgewoodForRewardCustomer + hotelList.get(2).weekendRateForRewardCustomer;
        }

        cheapHotelRewardCustomer_lakewood = sumWeekdayLakewoodForRewardCustomer / hotelList.get(0).getHotelRating();
        cheapHotelForRewardCustomer_bridgewood = sumWeekdayBridgewoodForRewardCustomer / hotelList.get(1).getHotelRating();
        cheapHotelForRewardCustomer_ridgewood = sumWeekdayRidgewoodForRewardCustomer / hotelList.get(2).getHotelRating();
        if (cheapHotelRewardCustomer_lakewood < cheapHotelForRewardCustomer_bridgewood && cheapHotelRewardCustomer_lakewood < cheapHotelForRewardCustomer_ridgewood) {
            System.out.println("Cheapest best rated hotel for reward customer is " + hotelList.get(0).getHotelName() + " with rate is " + sumWeekdayLakewoodForRewardCustomer + " and rating is " + hotelList.get(0).getHotelRating());
        } else if (cheapHotelForRewardCustomer_bridgewood < cheapHotelRewardCustomer_lakewood && cheapHotelForRewardCustomer_bridgewood < cheapHotelForRewardCustomer_ridgewood) {
            System.out.println("Cheapest best rated hotel is for reward customer is " + hotelList.get(1).getHotelName() + " with rate is " + sumWeekdayBridgewoodForRewardCustomer + " and rating is " + hotelList.get(1).getHotelRating());
        } else {
            System.out.println("Cheapest best rated hotel is for reward customer is " + hotelList.get(2).getHotelName() + " with rate is " + sumWeekdayRidgewoodForRewardCustomer + " and rating is " + hotelList.get(2).getHotelRating());
        }
    }

}
