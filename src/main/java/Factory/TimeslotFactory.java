package Factory;
//*
//        *  Name: Siphosethu
//        *  Student Number: 217237614
//        *  Group: 10
//        *
//        */


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
