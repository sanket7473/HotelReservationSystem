package com.bridgelabz;

import java.util.ArrayList;
/*
*@Desc:HotelReservationSystem class contains a arraylist which stores the hotel names and rates for
 regular customer and adding it into a list.
 */
public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
        ArrayList<Hotel> hotelList=new ArrayList<Hotel>();
        Hotel Lakewood = new Hotel( "Lakewood", 110);
        Hotel Bridgewood=new Hotel("Bridgewood",160);
        Hotel Ridgewood=new Hotel("Ridgewood",220);

        hotelList.add(Lakewood);
        hotelList.add(Bridgewood);
        hotelList.add(Ridgewood);
        System.out.println(hotelList);

    }
}
