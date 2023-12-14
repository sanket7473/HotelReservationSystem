package com.bridgelabz;

/*
 *@Desc: Hotel class has two variables hotelName and a ratesForRegularCustomer,weekdaysRateForRegularCustomer,weekendRateForregularcustomer,hotelRating.
  Containing methods getter and setter getHotelName,getRatesForRegularCustomer,
  setHotelName,setRatesForRegularCustomer,getWeekdaysRateForRegularCustomer,setWeekdaysRateForRegularCustomer,getWeekendRateForregularcustomer,
  setWeekendRateForregularcustomer,setHotelRating,getHotelRating .
 * .
 */
public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;
    int weekdaysRateForRegularCustomer;
    int weekendRateForregularcustomer;
    int hotelRating;

    //setHotelRating is to set the hotel ratings.
    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }
 //getHotelRating is to to get the hotel rating
    public int getHotelRating() {
        return hotelRating;
    }

    public Hotel(String hotelName, int ratesForRegularCustomer, int weekdaysRateForRegularCustomer, int weekendRateForregularcustomer, int hotelRating) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
        this.weekdaysRateForRegularCustomer = weekdaysRateForRegularCustomer;
        this.weekendRateForregularcustomer = weekendRateForregularcustomer;
        this.hotelRating=hotelRating;
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
