public class UserRole
{
/*
    UserRole.java
    Entity for UserRole
    Author: Jesse Merold Hiebner (220357676)
    Date: 09 April 2022
*/
    private int roleID;
    private String email;

    //default
    public UserRole(){}

    private UserRole (Builder builder)
    {
        this.roleID = builder.roleID;
        this.email = builder.email;
    }

    public int getRoleID()
    {
        return roleID;
    }

    public String getEmail()
    {
        return email;
    }

    public void setRoleID(int roleID)
    {
        this.roleID = roleID;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public static class Builder
    {
        private int RoleID;
        private String Email;

        public Builder setRoleID(int RoleID)
        {
            this.RoleID = RoleID;
            return this;
        }

        public Builder setEmail(String Email)
        {
            this.Email = Email;
            return this;
        }

        public UserRole build()
        {
            return new UserRole(this); //anonymous object (location, name or operating hours.)
        }
    }
}
