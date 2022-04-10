package repository;

import za.ac.cput.entity.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository
{
private static UserRepository repository = null;
private Set<User> UserDB = null;

private UserRepository()
{
    UserDB = new HashSet<User>();

}

public static UserRepository getRepository()
{
    if (repository == null)
    {
        repository = new UserRepository();
    }
    return repository;


}

}
