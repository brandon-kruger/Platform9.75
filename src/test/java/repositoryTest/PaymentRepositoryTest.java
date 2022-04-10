/* PaymentRepositoryTest.java testing CRUD repository crude methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repositoryTest;

import Factory.PaymentFactory;
import org.junit.jupiter.api.Test;
import repository.PaymentRepository;
import za.ac.cput.entity.Payment;


import static org.junit.jupiter.api.Assertions.*;

class PaymentRepositoryTest {
    private static PaymentRepository repository = PaymentRepository.getRepository();
    private static Payment payment = PaymentFactory.createPayment("65412318", 1200, 950519, "John", "Earle", 350.00, 64984613, 613 );

    @Test
    void create() {
        Payment created = repository.create(payment);
        assertEquals(payment.getReferenceNumber(), created.getReferenceNumber());
        System.out.println("create:" + created);

    }

    @Test
    void read() {
        Payment read = repository.read(payment.getReferenceNumber());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void update() {
        Payment updated = new Payment.Builder().setReferenceNumber("8684664")
                .setTicketNumb(654654)
                .setRoleID(6846)
                .setFirstName("George")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(payment.getReferenceNumber());
        assertTrue(success);
        System.out.println("Deleted:" + success);

    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}