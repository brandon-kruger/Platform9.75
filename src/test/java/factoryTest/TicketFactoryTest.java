/* Ticket.java Entity
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package factoryTest;

import Factory.TicketFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Ticket;


import static org.junit.jupiter.api.Assertions.*;

class TicketFactoryTest {

   @Test
   public void test() {
       Ticket ticket = TicketFactory.createTicket("65412318", 1200, "NU-Metro", "Ghost Busters", "17:00  seat: J5 performance: Evening", 3, 5,350.00);
       System.out.println(ticket.toString());
       assertNotNull(ticket);
    }
}