/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 */

package entity;

public class Timeslot {

    private String screeningRoom;
    private String Time;
    public static String isAvailable;

    public Timeslot(String screeningRoom, String Time, String isAvailable) {
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


    public String getScreeningRoom() {
        return screeningRoom;
    }

    public String getTime() {
        return Time;
    }

    public String isAvailable() {
        return isAvailable;
    }

    public static class Builder {

        private String screeningRoom;
        private String Time;
        private String isAvailable;

        public Builder setScreeningRoom(String screeningRoom) {
            this.screeningRoom = screeningRoom;
            return this;
        }

        public Builder setTime(String time) {
            Time = time;
            return this;
        }

        public Builder setAvailable(String isAvailable) {
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

        public Builder setIsAvailable(String isAvailable) {
        return this;
        }
    }
}



