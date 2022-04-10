/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package Util;
import java.util.UUID;

public class SiphiweHelper {
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }

    public static boolean validEmail(String email) {
        String regex = "^\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
        return email.matches(regex);
    }
}
