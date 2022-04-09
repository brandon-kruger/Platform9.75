package entity;

public class Booking {
    private int referenceNumber,foodNumber, beverageNumber;
    private String date, time, location;


    public Booking(String date, String time, String location, int referenceNumber, int foodNumber,
                    int beverageNumber) {
        this.date = date;
        this.time = time;
        this.location = location;
        this.referenceNumber = referenceNumber;
        this.foodNumber = foodNumber;
        this.beverageNumber = beverageNumber;
    }

    private Booking(Builder builder)
    {
        this.date = date;
        this.time = time;
        this.location = location;
        this.referenceNumber = referenceNumber;
        this.foodNumber =foodNumber;
        this.beverageNumber = beverageNumber;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public int getFoodNumber() {
        return foodNumber;
    }

    public int getBeverageNumber() {
        return beverageNumber;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }


    public static class Builder {

        private int referenceNumber,foodNumber, beverageNumber;
        private String date, time, location;

        public Builder setReferenceNumber(int referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setFoodNumber(int foodNumber) {
            this.foodNumber = foodNumber;
            return this;
        }

        public Builder setBeverageNumber(int beverageNumber) {
            this.beverageNumber = beverageNumber;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Booking build(){

            return new Booking(this);
        }

        public Builder copy(Booking b){
            this.referenceNumber = referenceNumber;
            this.time = b.time;
            this.date = b.date;
            this.location = location;
            this.foodNumber =foodNumber;
            this.beverageNumber = beverageNumber;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "referenceNumber=" + referenceNumber +
                    ", foodNumber=" + foodNumber +
                    ", beverageNumber=" + beverageNumber +
                    ", date='" + date + '\'' +
                    ", time='" + time + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }

}
