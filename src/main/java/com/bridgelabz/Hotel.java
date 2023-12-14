package com.bridgelabz;

/*
 *@Desc: Hotel class has two variables hotelName and a ratesForRegularCustomer.
  Containing methods getter and setter getHotelName,getRatesForRegularCustomer,
  setHotelName,setRatesForRegularCustomer,getWeekdaysRateForRegularCustomer,setWeekdaysRateForRegularCustomer,getWeekendRateForregularcustomer,
  setWeekendRateForregularcustomer
 * .
 */
public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;
    int weekdaysRateForRegularCustomer;
    int weekendRateForregularcustomer;

    public Hotel(String hotelName, int ratesForRegularCustomer, int weekdaysRateForRegularCustomer, int weekendRateForregularcustomer) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
        this.weekdaysRateForRegularCustomer = weekdaysRateForRegularCustomer;
        this.weekendRateForregularcustomer = weekendRateForregularcustomer;
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
