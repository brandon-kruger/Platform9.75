package Factory;


import za.ac.cput.entity.UserRole;

public class UserRoleFactory
{
    //User roles created here
    public static UserRole createUserRole(int RoleID, String email)
    {
        //Validation
        if (RoleID == 0){}
        if (email.equals("") || email == null) {return null;}        //email.isEmpty()
                                                                    //email.EqualsIgnoreCase()

        return new UserRole.Builder()
                 .setRoleID(RoleID)
                 .setEmail(email)
                 .build();
    }
}
