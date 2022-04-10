/* Payment.java Entity using builder pattern
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
**/

package za.ac.cput.entity;

public class Payment {
    private String referenceNumber;
    private int ticketNumb;
    private int roleID;
    private String firstName;
    private String lastName;
    private double amountDue;
    /* private double moviePrice;
     private double ticketPrice;
     private static final double tax = 0.18;
    */
    private int cardNumber;
    private int cvv;

    // create private constructor for builder pattern
    private Payment (Builder builder){
        this.referenceNumber = builder.referenceNumber;
        this.ticketNumb = builder.ticketNumb;
        this.roleID = builder.roleID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.amountDue = builder.amountDue;
        this.cardNumber = builder.cardNumber;
        this.cvv = builder.cvv;

    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
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

    public int getTicketNumb() {
        return ticketNumb;
    }

    public void setTicketNumb(int ticketNumb) {
        this.ticketNumb = ticketNumb;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

   /* public double payment(double amountDue , double moviePrice , double ticketPrice ,double addOnPrice, double tax ){
        tax = (moviePrice + ticketPrice + addOnPrice) * tax;
        amountDue = tax + (moviePrice + ticketPrice + addOnPrice);

        return amountDue;

    }*/

    @Override
    public String toString() {
        return "Payment{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", ticketNumb=" + ticketNumb +
                ", roleID=" + roleID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amountDue=" + amountDue +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                '}';
    }

    public static class Builder{
        private String referenceNumber;
        private int roleID;
        private String firstName;
        private String lastName;
        private int ticketNumb;
        private double amountDue;
        private int cardNumber;
        private int cvv;

        public Builder setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder setRoleID(int roleID) {
            this.roleID = roleID;
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

        public Builder setTicketNumb(int ticketNumb) {
            this.ticketNumb = ticketNumb;
            return this;
        }

        public Builder setAmountDue(double amountDue) {
            this.amountDue = amountDue;
            return this;
        }

        public Builder setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setCvv(int cvv) {
            this.cvv = cvv;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }

    }


}

