/* Ticket.java Entity using builder pattern
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
   **/

package za.ac.cput.entity;

public class Ticket {
    private String referenceNumber;
    private int ticketNumb;
    private String cinema;
    private String movie;
    private String timeSlot;
    private int admit;
    private int addOns;
    private double totalPrice;


    // create private constructor for builder pattern
    private Ticket (Builder builder){
        this.referenceNumber = builder.referenceNumber;
        this.ticketNumb = builder.ticketNumb;
        this.cinema = builder.cinema;
        this.movie = builder.movie;
        this.timeSlot = builder.timeSlot;
        this.admit = builder.admit;
        this.addOns = builder.addOns;
        this.totalPrice = builder.totalPrice;

    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getTicketNumb() {
        return ticketNumb;
    }

    public void setTicketNumb(int ticketNumb) {
        this.ticketNumb = ticketNumb;
    }


    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public int getAdmit() {
        return admit;
    }

    public void setAdmit(int admit) {
        this.admit = admit;
    }

    public int getAddOns() {
        return addOns;
    }

    public void setAddOns(int addOns) {
        this.addOns = addOns;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", ticketNumb=" + ticketNumb +
                ", cinema='" + cinema + '\'' +
                ", movie='" + movie + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", admit=" + admit +
                ", addOns=" + addOns +
                ", totalPrice=" + totalPrice +
                '}';
    }

    // Nested static builder class
    public static class Builder{
        private String referenceNumber;
        private int ticketNumb;
        private String cinema;
        private String movie;
        private String timeSlot;
        private int admit;
        private int addOns;
        private double totalPrice;

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setTicketNumb(int ticketNumb) {
            this.ticketNumb = ticketNumb;
            return this;
        }

        public Builder setCinema(String cinema) {
            this.cinema = cinema;
            return this;
        }

        public Builder setMovie(String movie) {
            this.movie = movie;
            return this;
        }

        public Builder setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }

        public Builder setAdmit(int admit) {
            this.admit = admit;
            return this;
        }

        public Builder setAddOns(int addOns) {
            this.addOns = addOns;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Ticket build(){
            return new Ticket(this);
        }
    }
}
