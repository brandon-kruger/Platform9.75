/* Receipt.java Entity using builder pattern
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
**/

package za.ac.cput.entity;

public class Receipt {
    private String referenceNumber;
    private int ticketNumb;
    private String firstName;
    private String lastName;
    private String movie;
    private int addOns;
    private double paidAmount;


    // create private constructor for builder pattern
    private Receipt (Builder builder){
        this.referenceNumber = builder.referenceNumber;
        this.ticketNumb = builder.ticketNumb;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.movie = builder.movie;
        this.addOns = builder.addOns;
        this.paidAmount = builder.paidAmount;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getAddOns() {
        return addOns;
    }

    public void setAddOns(int addOns) {
        this.addOns = addOns;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", ticketNumb=" + ticketNumb +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", movie='" + movie + '\'' +
                ", addOns=" + addOns +
                ", paidAmount=" + paidAmount +
                '}';
    }

    public static class Builder {
        private String referenceNumber;
        private int ticketNumb;
        private String firstName;
        private String lastName;
        private String movie;
        private int addOns;
        private double paidAmount;

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setTicketNumb(int ticketNumb) {
            this.ticketNumb = ticketNumb;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMovie(String movie) {
            this.movie = movie;
            return this;
        }

        public Builder setAddOns(int addOns) {
            this.addOns = addOns;
            return this;
        }

        public Builder setPaidAmount(double paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        public Receipt build(){
            return new Receipt(this);
        }
    }
}
