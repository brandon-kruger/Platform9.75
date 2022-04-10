/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package Factory;

import entity.Booking;
import Util.SiphiweHelper;

public class BookingFactory {
    public static Booking createBooking(int referenceNumber, String date, String Time,
                                              int foodNumber, int beverageNumber) {


        String location = SiphiweHelper.generateID();
        Booking Booking = new Booking.Builder().setBeverageNumber(beverageNumber)
                .setReferenceNumber(referenceNumber)
                .setDate(date)
                .setTime(Time)
                .setLocation(location)
                .setFoodNumber(foodNumber)
                .setBeverageNumber(beverageNumber)
                .build();
        return Booking;
    }


}
