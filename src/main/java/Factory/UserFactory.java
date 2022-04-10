package Factory;

import za.ac.cput.entity.User;

public class UserFactory
{
    //User created here
    public static User createUser(String email, String name, String surname, String cellNumber, String dateOfBirth)
    {
        //Validation
        if (email.equals("") || email == null)
            return null;

        if (name.equals("") || name == null)
            return null;

        if (surname.equals("") || surname == null)
            return null;

        if (cellNumber.equals("") || cellNumber == null)
            return null;

        if (dateOfBirth.equals("") || dateOfBirth == null)
            return null;

       return new User.Builder()
                   .setName("Jesse")
                   .setSurname("Hiebner")
                   .setEmail("jhiebner1@gmail.com")
                   .setCellNumber("0817364831")
                   .setDateOfBirth("28 June 1998")
                   .build();
    }
}
