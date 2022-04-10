/*
ILoginRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;

import za.ac.cput.entity.Login;
import java.util.Set;

public interface ILoginRepository extends IRepository<Login, String>{

    public Set<Login> getAll();

}
