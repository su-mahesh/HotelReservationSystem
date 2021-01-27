package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

    @Test
    public void givenHotelNameAndRatesForRegularCustomer_WhenAdded_ShouldReturnSame() {

        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

        hotelReservationSystem.addHotel("Lakewood", (Float) 100f);

        Boolean result1 = hotelReservationSystem.checkIfHotelExist("Lakewood");
        Float result2 = hotelReservationSystem.getRateForRegularCustomer("Lakewood");

        Assert.assertTrue(result1);
        Assert.assertEquals((Float) 100f, result2);
    }

}
