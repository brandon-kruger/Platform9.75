/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package factoryTest;

import Factory.BookingFactory;
import entity.Booking;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookingFactoryTest {

     @Test
    public void test (){
         Booking booking = BookingFactory.createBooking(
                 2637, "11 April 2022", "12:40", 154, 163);
         System.out.println(booking.toString());
         assertNotNull(booking);

     }


}
