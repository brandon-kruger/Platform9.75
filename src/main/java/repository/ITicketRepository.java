/* ITicketRepository.java interface extending main interface
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;



import za.ac.cput.entity.Ticket;

import java.util.Set;

public interface ITicketRepository extends IRepository<Ticket, String>{

    Ticket read(String referenceNumber);

    public Set<Ticket> getAll();


}
