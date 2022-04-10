package za.ac.cput.entity;

public class Seat {
    private String seatNumber;
    private String rowNumber;
    private String seatType;

    private Seat (){

    }

    private Seat (Builder builder) {
        this.seatNumber = builder.seatNumber;
        this.rowNumber = builder.rowNumber;
        this.seatType = builder.seatType;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getRowNumber() {
        return rowNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", rowNumber='" + rowNumber + '\'' +
                ", seatType='" + seatType + '\'' +
                '}';
    }

    public static class Builder {
        private String seatNumber;
        private String rowNumber;
        private String seatType;


        public Builder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder setRowNumber(String rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }

        public Builder setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }

        public Seat build(){
            return new Seat(this);
        }

    }
}
