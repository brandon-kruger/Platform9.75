package Factory;

public class Seat {
    public static entity.Seat build(String seatNumber, String rowNumber, String seatType) {

        return new entity.Seat.Builder().setSeatNumber(seatNumber).setRowNumber(rowNumber).setSeatType(seatType).build();
    }
}
