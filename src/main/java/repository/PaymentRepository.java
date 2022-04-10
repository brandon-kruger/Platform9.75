/* PaymentRepository.java implementing interface and initialising interface methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;


import za.ac.cput.entity.Payment;

import java.util.HashSet;
import java.util.Set;

public class PaymentRepository implements IPaymentRepository {
    private static PaymentRepository repository = null;
    private Set<Payment> paymentDB = null;

    private PaymentRepository (){paymentDB = new HashSet<Payment>(); }

    public static PaymentRepository getRepository(){
        if(repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }


    @Override
    public Payment create(Payment payment) {
        boolean success = paymentDB.add(payment);
        if(!success)
            return null;
        return payment;
    }

    @Override
    public Payment read(Payment ID) {
        return null;
    }

    @Override
    public Payment read(String referenceNumber) {
        Payment payment = paymentDB.stream()
                .filter(p -> p.getReferenceNumber().equals(referenceNumber))
                .findAny()
                .orElse(null);
        return payment;
    }



    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read(payment.getReferenceNumber());
        if(oldPayment != null){
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String referenceNumber) {
        Payment paymentToDelete = read(referenceNumber);
        if(paymentToDelete == null)
            return false;
        paymentDB.remove(paymentToDelete);
        return true;
    }

    @Override
    public Set<Payment> getAll() {
        return paymentDB;
    }
}
