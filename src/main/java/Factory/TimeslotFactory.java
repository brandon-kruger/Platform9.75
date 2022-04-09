/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package Factory;
import Util.SiphiweHelper;
import entity.Timeslot;

public class TimeslotFactory {
    public static <screenRoom> Timeslot createTimeslot(screenRoom screenRoom, boolean isAvailable){


        double Time = Double.parseDouble(SiphiweHelper.generateID());
        Object screeningRoom;
        Timeslot timeslot =new Timeslot.Builder().setTime(Time)
                .setIsAvailable(isAvailable)
                .setTime(Time)
                .build();
        return timeslot;
    }
}
