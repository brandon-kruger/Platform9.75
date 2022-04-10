/* TicketRepository.java implementing interface and initialising interface methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;


import za.ac.cput.entity.Ticket;

import java.util.HashSet;
import java.util.Set;

public class TicketRepository implements ITicketRepository {
    private static TicketRepository repository = null;
    private Set<Ticket> ticketDB = null;

    private TicketRepository (){ticketDB = new HashSet<Ticket>(); }

    public static TicketRepository getRepository(){
        if(repository == null) {
            repository = new TicketRepository();
        }
        return repository;
    }

    @Override
    public Ticket create(Ticket ticket){
        boolean success = ticketDB.add(ticket);
        if(!success)
            return null;
        return ticket;
    }

    @Override
    public Ticket read(Ticket ID) {
        return null;
    }

    @Override
    public Ticket read(String referenceNumber) {
        Ticket ticket = ticketDB.stream()
                .filter(t -> t.getReferenceNumber().equals(referenceNumber))
                .findAny()
                .orElse(null);
        return ticket;
    }

    @Override
    public Ticket update(Ticket ticket) {
        Ticket oldTicket = read(ticket.getReferenceNumber());
        if(oldTicket != null){
            ticketDB.remove(oldTicket);
            ticketDB.add(ticket);
            return ticket;
        }
        return null;

    }

    @Override
    public boolean delete(String referenceNumber) {
        Ticket ticketToDelete = read(referenceNumber);
        if(ticketToDelete == null)
            return false;
        ticketDB.remove(ticketToDelete);
        return true;
    }


    @Override
    public Set<Ticket> getAll() {
        return ticketDB;
    }
}
