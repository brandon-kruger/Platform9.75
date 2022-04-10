/* Ticket.java Entity
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package factoryTest;

import Factory.PaymentFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Payment;


import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    public void test() {
        Payment payment = PaymentFactory.createPayment("65412318", 1200, 950519, "John", "Earle", 350.00, 64984613, 613 );
        System.out.println(payment.toString());
        assertNotNull(payment);
    }

}