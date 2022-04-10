/* TicketRepositoryTest.java testing CRUD repository crude methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repositoryTest;

import Factory.TicketFactory;
import org.junit.jupiter.api.Test;
import repository.TicketRepository;
import za.ac.cput.entity.Ticket;



import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {
    private static TicketRepository repository = TicketRepository.getRepository();
    private static Ticket ticket = TicketFactory.createTicket("65412318", 1200, "NU-Metro", "Ghost Busters", "17:00  seat: J5 performance: Evening", 3, 5,350.00);

    @Test
    void create() {
        Ticket created = repository.create(ticket);
        assertEquals(ticket.getReferenceNumber(), created.getReferenceNumber());
        System.out.println("create:" + created);
    }

    @Test
    void read() {
       Ticket read = repository.read(ticket.getReferenceNumber());
        assertNotNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void update() {
        Ticket updated = new Ticket.Builder().setReferenceNumber("645456654")
                .setTicketNumb(6456465)
                .setMovie("R.I.P.D")
                .setAdmit(4)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(ticket.getReferenceNumber());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}