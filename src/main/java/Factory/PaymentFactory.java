/* PaymentFactory.java factory class to create payment objects
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
   */

package Factory;


import za.ac.cput.entity.Payment;

public class PaymentFactory {

    public static Payment createPayment(String referenceNumber, int ticketNumb, int roleID, String firstName, String lastName, double amountDue, int cardNumber, int cvv){
        return new Payment.Builder().setReferenceNumber(referenceNumber)
                .setRoleID(roleID)
                .setTicketNumb(ticketNumb)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAmountDue(amountDue)
                .setCardNumber(cardNumber)
                .setCvv(cvv)
                .build();
    }
}
