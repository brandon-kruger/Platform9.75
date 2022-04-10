/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;

import entity.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<Booking, String> {
    public Set<Booking> getAll();
}
