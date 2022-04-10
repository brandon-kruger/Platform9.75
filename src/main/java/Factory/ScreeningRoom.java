package Factory;

public class ScreeningRoom {
    public static entity.ScreeningRoom build(String seat, String screen, Boolean isOccupied) {

        return new entity.ScreeningRoom.Builder().setSeat(seat).setScreen(screen).setOccupied(isOccupied).build();
    }
}
