/* TicketFactory.java factory class to create ticket objects
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
   */

package Factory;


import za.ac.cput.entity.Ticket;

public class TicketFactory {

    public static Ticket createTicket(String referenceNumber, int ticketNumb, String cinema, String movie, String timeSlot, int admit, int addOns, double totalPrice){
        return new Ticket.Builder().setReferenceNumber(referenceNumber)
                .setTicketNumb(ticketNumb)
                .setCinema(cinema)
                .setMovie(movie)
                .setTimeSlot(timeSlot)
                .setAdmit(admit)
                .setAddOns(addOns)
                .setTotalPrice(totalPrice)
                .build();

    }
}
