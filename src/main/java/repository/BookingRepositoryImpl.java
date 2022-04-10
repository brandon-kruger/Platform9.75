/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;

import entity.Booking;
import java.util.HashSet;
import java.util.Set;

public class BookingRepositoryImpl implements IBookingRepository {

    private static BookingRepositoryImpl repository = null;
    private Set<Booking> bookingDB;

    private BookingRepositoryImpl(){
        this.bookingDB = new HashSet<>();
    }

    public static BookingRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new BookingRepositoryImpl();
        }
        return repository;
    }

    public static Booking createBooking(int referenceNumber, String date, String time, String location,
                                        int foodNumber,int beveragesNumber) {
        Booking Booking = null;
        return null;
    }

    @Override
    public Booking create(Booking booking) {
        this.bookingDB.add(booking);
        return booking;
    }

    @Override
    public Booking read(String location) {
        for (Booking book : bookingDB){
            if (book.getLocation().equals(location)){
                return book;
            }
        }
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        Booking<Object, Object> book = null;
        Booking booking1 = read(book.getTime());
        if (book != null){
            bookingDB.remove(book);
            bookingDB.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String location) {
        Booking deleteBooking = read((location));
        if (deleteBooking== null) {
            System.out.println("Booking is null");
            return false;
        }

        bookingDB.remove(location);
        System.out.println("Booking is removed");
        return true;
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDB;
    }

    public void deleteBooking(String location) {
    }
}
