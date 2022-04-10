/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package factoryTest;
import entity.Timeslot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeslotFactoryTest {

 @Test
    public void test(){
       Timeslot timeslot = TimeslotFactoryTest.createTimeslot(
               "5C",
               "12:00",
               "Not Available");
     System.out.println(timeslot.toString());
       assertNotNull(timeslot);
     }

    public static Timeslot createTimeslot(String ScreeningRoom, String Time, String isAvailable) {
        return null;
    }
}
