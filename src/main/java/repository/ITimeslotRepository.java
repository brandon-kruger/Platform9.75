/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;


import entity.Booking;
import entity.Timeslot;

import java.util.Set;

public interface ITimeslotRepository extends IRepository<Timeslot, String> {
    Booking read(String ScreeningRoom);

    public Set<Timeslot> getAll();
}
