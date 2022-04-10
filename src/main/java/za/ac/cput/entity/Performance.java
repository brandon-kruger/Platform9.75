package za.ac.cput.entity;

public class Performance {
    private String duration;
    private String movie;
    private int numberOfPerformances;
    private int totalNumberOfOperatingHours;

    private Performance (){

    }

    private Performance (Builder builder) {
        this.duration = builder.duration;
        this.movie = builder.movie;
        this.numberOfPerformances = builder.numberOfPerformances;
        this.totalNumberOfOperatingHours = builder.totalNumberOfOperatingHours;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setNumberOfPerformances(int numberOfPerformances) {
        this.numberOfPerformances = numberOfPerformances;
    }

    public void setTotalNumberOfOperatingHours(int totalNumberOfOperatingHours) {
        this.totalNumberOfOperatingHours = totalNumberOfOperatingHours;
    }

    public String getDuration() {
        return duration;
    }

    public String getMovie() {
        return movie;
    }

    public int getNumberOfPerformances() {
        return numberOfPerformances;
    }

    public int getTotalNumberOfOperatingHours() {
        return totalNumberOfOperatingHours;
    }

    public String performanceRuntime(){
        return duration;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "duration='" + duration + '\'' +
                ", movie='" + movie + '\'' +
                ", numberOfPerformances=" + numberOfPerformances +
                ", totalNumberOfOperatingHours=" + totalNumberOfOperatingHours +
                '}';
    }

    public static class Builder {
        private String duration;
        private String movie;
        private int numberOfPerformances;
        private int totalNumberOfOperatingHours;


        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setMovie(String movie) {
            this.movie = movie;
            return this;
        }

        public Builder setNumberOfPerformances(int numberOfPerformances) {
            this.numberOfPerformances = numberOfPerformances;
            return this;
        }

        public Builder setTotalNumberOfOperatingHours(int totalNumberOfOperatingHours) {
            this.totalNumberOfOperatingHours = totalNumberOfOperatingHours;
            return this;
        }

        public Performance build(){
            return new Performance(this);
        }

    }
}
