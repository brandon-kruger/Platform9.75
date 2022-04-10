/* ReceiptFactory.java factory class to create receipt objects
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
   */

package Factory;


import za.ac.cput.entity.Receipt;

public class ReceiptFactory {

    public static Receipt createReceipt(String referenceNumber, int ticketNumb, String firstName, String lastName, String movie, int addOns, double paidAmount){
        return new Receipt.Builder().setReferenceNumber(referenceNumber)
                .setTicketNumb(ticketNumb)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setMovie(movie)
                .setAddOns(addOns)
                .setPaidAmount(paidAmount)
                .build();

    }
}
