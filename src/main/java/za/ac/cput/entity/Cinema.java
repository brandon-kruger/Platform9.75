/*
Cinema.java
Entity for Cinema
Author: Brandon Lee Kruger (216049245)
Date: 10 April 2022
* */

package za.ac.cput.entity;

public class Cinema {

    private String location;
    private String nameOfCinema;
    private String operatingHours;

    // Default Constructor
    private Cinema (){

    }
    // Builder Class
    private Cinema (Builder builder) {
        this.location = builder.location;
        this.nameOfCinema = builder.nameOfCinema;
        this.operatingHours = builder.operatingHours;
    }

    public String getLocation() {
        return location;
    }

    public String getNameOfCinema() {
        return nameOfCinema;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNameOfCinema(String nameOfCinema) {
        this.nameOfCinema = nameOfCinema;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "location='" + location + '\'' +
                ", nameOfCinema='" + nameOfCinema + '\'' +
                ", operatingHours='" + operatingHours + '\'' +
                '}';
    }

    public static class Builder {
        private String location;
        private String nameOfCinema;
        private String operatingHours;


        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setNameOfCinema(String nameOfCinema) {
            this.nameOfCinema = nameOfCinema;
            return this;
        }

        public Builder setOperatingHours(String operatingHours) {
            this.operatingHours = operatingHours;
            return this;
        }


        public Cinema build(){
            return new Cinema(this); //anonymous object (location, name or operating hours.)
        }

    }
}
