package repository;

import entity.Seat;

import java.util.HashSet;
import java.util.Set;

public class SeatRepository implements Repository.ISeatRepository {
    private static SeatRepository repository = null;
    private Set<Seat> seatDB;

    private SeatRepository() {
        this.seatDB = new HashSet<>();
    }

    public static SeatRepository getRepository() {
        if (repository == null) {
            repository = new SeatRepository();
        }
        return repository;
    }

    @Override
    public Seat create(Seat seat) {
        this.seatDB.add(seat);
        return seat;
    }

    @Override
    public Seat read(String seatNumber) {
        for (Seat c : seatDB) {
            if (c.getSeatNumber().equals(seatNumber)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Seat update(Seat seat) {
        Seat aSeat = read(seat.getSeatNumber());
        if (aSeat != null) {
            seatDB.remove(aSeat);
            seatDB.add(seat);
            return seat;
        }
        return null;
    }

    @Override
    public void delete(String seatNumber) {
        Seat deleteSeat = read(seatNumber);
        if (deleteSeat == null) {
            System.out.println("Seat is null.");
        }
        seatDB.remove(deleteSeat);
        System.out.println("Seat removed.");
    }

    @Override
    public Set<Seat> getAll() {
        return seatDB;
    }
}
