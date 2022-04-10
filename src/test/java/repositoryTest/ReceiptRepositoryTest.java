/* ReceiptRepositoryTest.java testing CRUD repository crude methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repositoryTest;

import Factory.ReceiptFactory;
import org.junit.jupiter.api.Test;
import repository.ReceiptRepository;

import za.ac.cput.entity.Receipt;



import static org.junit.jupiter.api.Assertions.*;

class ReceiptRepositoryTest {
    private static ReceiptRepository repository = ReceiptRepository.getRepository();
    private static Receipt receipt = ReceiptFactory.createReceipt("65412318",1200,"John","Earle","Ghost Busters", 5,350.00);

    @Test
    void create() {
        Receipt created = repository.create(receipt);
        assertEquals(receipt.getReferenceNumber(), created.getReferenceNumber());
        System.out.println("create:" + created);
    }

    @Test
    void read() {
        Receipt read = repository.read(receipt.getReferenceNumber());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void update() {
        Receipt updated = new Receipt.Builder().setReferenceNumber("645456654")
                .setTicketNumb(6456465)
                .setMovie("R.I.P.D")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(receipt.getReferenceNumber());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}