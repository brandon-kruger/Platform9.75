/* IPaymentRepository.java interface extending main interface
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;


import za.ac.cput.entity.Payment;


import java.util.Set;

public interface IPaymentRepository extends IRepository<Payment, String>{
    Payment read(String referenceNumber);

    public Set<Payment> getAll();
}
