package repositoryTest;


import entity.Booking;
import entity.Timeslot;
import factoryTest.TimeslotFactoryTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import Factory.BookingFactory;
import repository.BookingRepositoryImpl;
import repository.TimeslotRepositoryImpl;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)


public class TimeslotRepositoryTest<timeSlot> {

    private  static TimeslotRepositoryImpl repository = TimeslotRepositoryImpl.getRepository();
    private static Timeslot timeslot = TimeslotFactoryTest.createTimeslot(
            "5C",
            "12:00",
            "Not Available");


    @Test
     void a_create() {
        Timeslot timeslot = TimeslotFactoryTest.createTimeslot(
                "5C",
                "12:00",
                "Not Available");
       assertNotNull(timeslot);
        System.out.println("Timeslot: " + timeslot);
    }





    @Test
    void b_read() {
        Booking read = repository.read(Timeslot.getIsAvailable());
        System.out.println("Read :" + read);
    }

    @Test
    void update() {
        Timeslot updateTimeslot = new Timeslot.Builder().copy(timeslot)
                .setScreeningRoom("B2")
                .setTime("12:20")
                .setIsAvailable("is not available at the moment")
                .build();
        assertEquals(updateTimeslot.getScreeningRoom(), timeslot.getTime());
        System.out.println("Updated Booking: " + updateTimeslot);
    }

    @Test
    void d_delete() {
        repository.delete(Timeslot.isAvailable);
        assertNotNull(repository);
    }

    @Test
    void e_getAll() {
        System.out.println("Order: \n" + repository.getAll());
    }
}
