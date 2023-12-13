package com.bridgelabz;
/*
*@Desc: Hotel class has two variables hotelName and a ratesForRegularCustomer.
* Containing methods getter and setter getHotelName,getRatesForRegularCustomer,
* setHotelName,setRatesForRegularCustomer.
 */
public class Hotel {
    String hotelName;
    int ratesForRegularCustomer;

    public Hotel(String hotelName, int ratesForRegularCustomer) {
        this.hotelName = hotelName;
        this.ratesForRegularCustomer = ratesForRegularCustomer;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRatesForRegularCustomer() {
        return ratesForRegularCustomer;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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
