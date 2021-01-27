package com.bridgelabz;

public class HotelReservationSystem {
    private String hotelName;
    private Float rateForRegularCustomer;

    public void addHotel(String hotelName, Float rateForRegularCustomer ) {
        this.hotelName = hotelName;
        this.rateForRegularCustomer = rateForRegularCustomer;
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
