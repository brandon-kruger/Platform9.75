/* ReceiptRepository.java implementing interface and initialising interface methods
   Author: Guy De La Cruz (218336969)
   Date: 07/04/2022
*/

package repository;


import za.ac.cput.entity.Receipt;

import java.util.HashSet;
import java.util.Set;

public class ReceiptRepository implements IReceiptRepository{
    private static ReceiptRepository repository = null;
    private Set<Receipt> receiptDB = null;

    private ReceiptRepository (){receiptDB = new HashSet<Receipt>(); }

    public static ReceiptRepository getRepository(){
        if(repository == null) {
            repository = new ReceiptRepository();
        }
        return repository;
    }

    @Override
    public Receipt create(Receipt receipt) {
        boolean success = receiptDB.add(receipt);
        if(!success)
            return null;
        return receipt;
    }

    @Override
    public Receipt read(Receipt ID) {
        return null;
    }

    @Override
    public Receipt read(String referenceNumber) {
        Receipt receipt = receiptDB.stream()
                .filter(r -> r.getReferenceNumber().equals(referenceNumber))
                .findAny()
                .orElse(null);
        return receipt;
    }

    @Override
    public Receipt update(Receipt receipt) {
       Receipt oldReceipt = read(receipt.getReferenceNumber());
        if(oldReceipt != null){
            receiptDB.remove(oldReceipt);
            receiptDB.add(receipt);
            return receipt;
        }
        return null;
    }

    @Override
    public boolean delete(String referenceNumber) {
       Receipt receiptToDelete = read(referenceNumber);
        if(receiptToDelete == null)
            return false;
        receiptDB.remove(receiptToDelete);
        return true;
    }

    @Override
    public Set<Receipt> getAll() {
        return receiptDB;
    }
}
