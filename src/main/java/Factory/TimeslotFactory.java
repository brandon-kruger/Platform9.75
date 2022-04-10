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
    public static Timeslot createTimeslot(String screeningRoom, String Time, String isAvailable){


        double timeslot = Double.parseDouble(SiphiweHelper.generateID());
        Timeslot timeSlot =new Timeslot.Builder().setTime(Time)
                .setIsAvailable(isAvailable)
                .setTime(Time)
                .build();
        return timeSlot;
    }
}
