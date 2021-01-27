package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelReservationSystem {
    private String hotelName;
    private Float rateForRegularCustomer;

    HashMap<String, Float> rates;
    HashMap<String,HashMap> hotels;

    public void addHotel(String hotelName, Float rateForRegularCustomer ) {

        rates = new HashMap<>();
        hotels = new HashMap<>();

        rates.put("Rate for RegularCustomer", rateForRegularCustomer);
        hotels.put(hotelName, rates);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
    }


    public String getHotelName() {

        return hotelName;
    }

    public Float getRateForRegularCustomer() {

        return rateForRegularCustomer;
    }
}
