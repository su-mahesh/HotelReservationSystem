package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

    @Test
    public void givenHotelNameAndRatesForRegularCustomer_WhenAdded_ShouldReturnSame() {

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel("Lakewood", 100f);
        String result1 = hotelReservationSystem.getHotelName();

        Float result2 = hotelReservationSystem.getRateForRegularCustomer();

        Assert.assertEquals("Lakewood", result1);
        Assert.assertEquals((Float) 100f, result2);
    }
}
