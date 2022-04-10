package repository;

import entity.Performance;

import java.util.HashSet;
import java.util.Set;

public class PerformanceRepository implements Repository.IPerformanceRepository {
    private static PerformanceRepository repository = null;
    private Set<entity.Performance> performanceDB;

    private PerformanceRepository() {
        this.performanceDB = new HashSet<>();
    }

    public static PerformanceRepository getRepository() {
        if (repository == null) {
            repository = new PerformanceRepository();
        }
        return repository;
    }

    @Override
    public entity.Performance create(entity.Performance performance) {
        this.performanceDB.add(performance);
        return performance;
    }

    @Override
    public entity.Performance read(String performanceMovie) {
        for (Performance c : performanceDB) {
            if (c.getMovie().equals(performanceMovie)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Performance update(Performance performance) {
        Performance aPerformance = read(performance.getMovie());
        if (aPerformance != null) {
            performanceDB.remove(aPerformance);
            performanceDB.add(performance);
            return performance;
        }
        return null;
    }

    @Override
    public void delete(String performanceMovie) {
        Performance deletePerformance = read(performanceMovie);
        if (deletePerformance == null) {
            System.out.println("Performance is null.");
        }
        performanceDB.remove(deletePerformance);
        System.out.println("Performance removed.");
    }

    @Override
    public Set<Performance> getAll() {
        return performanceDB;
    }
}
