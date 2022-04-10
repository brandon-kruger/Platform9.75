/* Ticket.java Entity
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package factoryTest;

import Factory.ReceiptFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Receipt;



import static org.junit.jupiter.api.Assertions.*;

class ReceiptFactoryTest {
    @Test
    public void test() {
        Receipt receipt = ReceiptFactory.createReceipt("65412318",1200,"John","Earle","Ghost Busters", 5,350.00);
        System.out.println(receipt.toString());
        assertNotNull(receipt);
    }

}