package com.bridgelabz;

/*
 *@Desc: Hotel class has two variables hotelName and a
 ratesForRegularCustomer,weekdaysRateForRegularCustomer,weekendRateForregularcustomer,hotelRating,weekdaysRateForRewardcustomer,weekendRateForRewardCustomer.
 * Containing methods getter and setter getHotelName,getRatesForRegularCustomer,getWeekdaysRateForRewardcustomer,getWeekendRateForRewardCustomer.
  setHotelName,setRatesForRegularCustomer,getWeekdaysRateForRegularCustomer,setWeekdaysRateForRegularCustomer,getWeekendRateForregularcustomer,
  setWeekendRateForregularcustomer,setHotelRating,getHotelRating,setWeekdaysRateForRewardcustomer,setWeekendRateForRewardCustomer .
 * .
 */
public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;
    int weekdaysRateForRegularCustomer;
    int weekendRateForregularcustomer;
    int hotelRating;
    //weekdaysRateForRewardcustomer storing special rate for reward customer in weekday.
    int weekdaysRateForRewardcustomer;
    //weekendRateForRewardCustomer storing a special rate for reward customers in weekends.
    int weekendRateForRewardCustomer;

    public Hotel(String hotelName, int ratesForRegularCustomer, int weekdaysRateForRegularCustomer, int weekendRateForregularcustomer, int hotelRating,int weekdaysRateForRewardcustomer,int weekendRateForRewardCustomer) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
        this.weekdaysRateForRegularCustomer = weekdaysRateForRegularCustomer;
        this.weekendRateForregularcustomer = weekendRateForregularcustomer;
        this.hotelRating = hotelRating;
        this.weekdaysRateForRewardcustomer=weekdaysRateForRewardcustomer;
        this.weekendRateForRewardCustomer=weekendRateForRewardCustomer;
    }

    public int getWeekdaysRateForRewardcustomer() {
        return weekdaysRateForRewardcustomer;
    }

    public int getWeekendRateForRewardCustomer() {
        return weekendRateForRewardCustomer;
    }

    public void setWeekdaysRateForRewardcustomer(int weekdaysRateForRewardcustomer) {
        this.weekdaysRateForRewardcustomer = weekdaysRateForRewardcustomer;
    }

    public void setWeekendRateForRewardCustomer(int weekendRateForRewardCustomer) {
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    //getHotelRating is to to get the hotel rating
    public int getHotelRating() {
        return hotelRating;
    }

    //setHotelRating is to set the hotel ratings.
    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    public int getWeekdaysRateForRegularCustomer() {
        return weekdaysRateForRegularCustomer;
    }

    public void setWeekdaysRateForRegularCustomer(int weekdaysRateForRegularCustomer) {
        this.weekdaysRateForRegularCustomer = weekdaysRateForRegularCustomer;
    }

    public int getWeekendRateForregularcustomer() {
        return weekendRateForregularcustomer;
    }

    public void setWeekendRateForregularcustomer(int weekendRateForregularcustomer) {
        this.weekendRateForregularcustomer = weekendRateForregularcustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRatesForRegularCustomer() {
        return ratesForRegularCustomer;
    }

    public void setRatesForRegularCustomer(int ratesForRegularCustomer) {
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", ratesForRegularCustomer=" + ratesForRegularCustomer +
                '}';
    }
}
