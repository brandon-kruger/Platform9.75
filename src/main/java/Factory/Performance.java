package Factory;

public class Performance {
    public static entity.Performance build(String duration, String movie, int numberOfPerformance, int totalNumberOfOperatingHours) {

        return new entity.Performance.Builder().setDuration(duration).setMovie(movie).setNumberOfPerformances(numberOfPerformance).setTotalNumberOfOperatingHours(totalNumberOfOperatingHours).build();
    }
}
