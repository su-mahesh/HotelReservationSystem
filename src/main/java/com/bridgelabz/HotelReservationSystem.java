package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelReservationSystem {
    private String hotelName;
    private Float rateForRegularCustomer;

    HashMap<String, Float> rates;
    HashMap<String,HashMap<String, Float>> hotels;

    public void addHotel(String hotelName, Float rateForRegularCustomer ) {

        rates = new HashMap<>();
        hotels = new HashMap<>();

        rates.put("Rate for Regular Customer", (Float) rateForRegularCustomer);
        hotels.put(hotelName.toLowerCase(), rates);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
    }

    public Float getRateForRegularCustomer(String hotelName) {
        hotelName = hotelName.toLowerCase();
        if (hotels.containsKey(hotelName))
            return hotels.get(hotelName).get("Rate for Regular Customer");
        else
            return 0f;
    }

    public Boolean checkIfHotelExist(String hotelName) {

        if (hotels.containsKey(hotelName.toLowerCase()))
            return true;
        else
            return false;
    }
}
