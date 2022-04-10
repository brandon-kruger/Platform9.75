package repository;

import entity.Seat;

import java.util.Set;

public interface ISeatRepository extends IRepository<Seat, String>{
    public Set<Seat> getAll();
}
