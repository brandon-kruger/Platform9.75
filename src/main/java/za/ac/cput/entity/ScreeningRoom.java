package za.ac.cput.entity;

public class ScreeningRoom {
    private String seat;
    private String screen;
    private Boolean isOccupied;

    private ScreeningRoom (){

    }

    private ScreeningRoom (Builder builder) {
        this.seat = builder.seat;
        this.screen = builder.screen;
        this.isOccupied = builder.isOccupied;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public String getSeat() {
        return seat;
    }

    public String getScreen() {
        return screen;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public Boolean screenRoomAvailable(){
        Boolean occupied = false;

        if (isOccupied == true){
            occupied = true;
        } else if (isOccupied == false){
            occupied = false;
        }

        return occupied;
    }

    @Override
    public String toString() {
        return "ScreeningRoom{" +
                "seat='" + seat + '\'' +
                ", screen='" + screen + '\'' +
                ", isOccupied=" + isOccupied +
                '}';
    }

    public static class Builder {
        private String seat;
        private String screen;
        private Boolean isOccupied;

        public Builder setSeat(String seat) {
            this.seat = seat;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setOccupied(boolean isOccupied) {
            this.isOccupied = isOccupied;
            return this;
        }

        public ScreeningRoom build(){
            return new ScreeningRoom(this);
        }

    }
}
