/*
KioskFactoryTest.java
Author: Brandon Lee Kruger (216049245)
Date: 08 April 2022
* */
package factoryTest;

import Factory.KioskFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Kiosk;

import static org.junit.jupiter.api.Assertions.*;

class KioskFactoryTest {

    @Test
    void createKiosk() {
        Kiosk kiosk = KioskFactory.createKiosk("1","Popcorn", "Coffee", "Pizza", 20, 20,10,4);
        System.out.println(kiosk.toString());
        assertNotNull(kiosk);
    }
}