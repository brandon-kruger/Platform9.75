package Factory;


import za.ac.cput.entity.Role;

public class RoleFactory
{
    //Role created here
    public static Role createRole(int RoleID, String Admin, String SilverMember, String GoldMember, String VIPMember)
    {
        //Validation
        if (RoleID == 0)
            return null;

        if (Admin.equals("") || Admin == null)
            return null;

        if (SilverMember.equals("") || SilverMember == null)
            return null;

        if (GoldMember.equals("") || GoldMember == null)
            return null;

        if (VIPMember.equals("") || VIPMember == null)
            return null;

        return new Role.Builder()
                 .setRoleID(1)
                 .setSilverMember("yes")
                 .setGoldMember("no")
                 .setVipMember("no")
                 .build();
    }

}