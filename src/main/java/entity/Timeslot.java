/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package entity;

public class Timeslot<screeningRoom> {

    private screeningRoom screeningRoom;
    private double Time;
    private boolean isAvailable;

    public Timeslot(screeningRoom screeningRoom, double Time, boolean isAvailable) {
        this.screeningRoom = screeningRoom;
        this.Time = Time;
        this.isAvailable = isAvailable;
    }

    private Timeslot(Builder builder) {
        this.screeningRoom = screeningRoom;
        this.Time = Time;
        this.isAvailable = isAvailable;
    }

    public static String getIsAvailable() {
        return null;
    }

    public screeningRoom getScreeningRoom() {
        return screeningRoom;
    }

    public double getTime() {
        return Time;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public class Builder {

        private Object screeningRoom;
        private double Time;
        private boolean isAvailable;

        public Builder setScreeningRoom(screeningRoom screeningRoom) {
            this.screeningRoom = screeningRoom;
            return this;
        }

        public Builder setTime(double time) {
            Time = time;
            return this;
        }

        public Builder setAvailable(boolean available) {
            isAvailable = isAvailable;
            return this;
        }

        public Timeslot build() {

            return new Timeslot(this);
        }

        public Builder copy(Timeslot T) {
            this.screeningRoom = T.screeningRoom;
            this.Time = T.Time;
            this.isAvailable = T.isAvailable;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "screeningRoom=" + screeningRoom +
                    ", Time=" + Time +
                    ", isAvailable=" + isAvailable +
                    '}';
        }

        public Builder setIsAvailable(boolean isAvailable) {
        return this;
        }
    }
}



