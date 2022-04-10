package repositoryTest;

import entity.Booking;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import repository.BookingRepositoryImpl;

import Factory.BookingFactory;
import repository.BookingRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BookingRepositoryTest {

    private static BookingRepositoryImpl repository = BookingRepositoryImpl.getRepository();
    private static  Booking booking = BookingFactory.createBooking(
            2637, "11 April 2022", "12:40", 154, 163);

    @Order(1)
    @Test
    void create() {
        Booking booking = BookingFactory.createBooking(
                2637, "11 April 2022", "12:40", 154, 163);
        assertNotNull(booking);
        System.out.println("Booked: " + booking);
    }

    @Order(2)
    @Test
    void read() {
        Booking read = repository.read(Booking.getTime());
        System.out.println("Read: " + read);

    }
    @Order(3)
    @Test
    void update() {
        Booking updateBooking = new Booking.Builder().copy(booking)
                .setReferenceNumber(1224)
                .setTime("10:30")
                .setLocation("Cape Town")
                .setFoodNumber(26)
                .setBeverageNumber(26)
                .build();
        assertEquals(updateBooking.getReferenceNumber(), booking.getReferenceNumber());
        System.out.println("Updated Booking: " + updateBooking);
    }
    @Order(4)
    @Test
    void delete() {
        repository.delete(booking.getDate());
        assertNotNull(repository);
    }
    @Order(5)
    @Test
    void getAll() {
        System.out.println("Booking: \n" + repository.getAll());


    }
}
