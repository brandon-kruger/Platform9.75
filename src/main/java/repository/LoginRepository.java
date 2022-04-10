/*
LoginRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;

import za.ac.cput.entity.Login;
import java.util.HashSet;
import java.util.Set;

public class LoginRepository implements ILoginRepository{

    private static LoginRepository repository = null;
    private Set<Login> loginDB = null;

    private LoginRepository (){loginDB = new HashSet<Login>(); }

    public static LoginRepository getRepository(){
        if(repository == null) {
            repository = new LoginRepository();
        }
        return repository;
    }

    @Override
    public Set<Login> getAll() {
        return null;
    }

    @Override
    public Login create(Login login) {
        return null;
    }

    @Override
    public Login read(Login ID) {
        return null;
    }

    @Override
    public Login update(Login login) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
