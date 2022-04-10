/* IReceiptRepository.java interface extending main interface
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;



import za.ac.cput.entity.Receipt;

import java.util.Set;

public interface IReceiptRepository extends IRepository<Receipt, String>{
    Receipt read(String referenceNumber);

    public Set<Receipt> getAll();
}
