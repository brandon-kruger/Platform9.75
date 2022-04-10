/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;
import entity.Booking;

public interface IRepository<T,ID> {
    T create(T t);
    T read(T ID);
    T update(T t);
    boolean delete(ID id);
}
