/*
CinemaFactoryTest.java
Author: Brandon Lee Kruger (216049245)
Date: 10 April 2022
* */
package factoryTest;

import Factory.CinemaFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Cinema;

import static org.junit.jupiter.api.Assertions.*;

class CinemaFactoryTest {

    @Test
    void createCinema() {
        Cinema cinema = CinemaFactory.createCinema("NuMetro", "lat: 53.2734 long: -7.77832031", "09:00 - 23:30");
        System.out.println(cinema.toString());
        assertNotNull(cinema);
    }
}