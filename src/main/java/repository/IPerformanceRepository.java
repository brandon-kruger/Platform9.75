package repository;

import entity.Performance;

import java.util.Set;

public interface IPerformanceRepository extends IRepository<Performance, String> {
    public Set<Performance> getAll();
}
