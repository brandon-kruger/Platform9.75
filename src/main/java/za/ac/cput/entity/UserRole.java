package za.ac.cput.entity;

public class UserRole
{
/*
    za.ac.cput.Domain.UserRole.java
    Entity for za.ac.cput.Domain.UserRole
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
        this.email = builder.Email;
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

    @Override
    public String toString() {
        return "UserRole{" +
                "roleID=" + roleID +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder
    {
        public int roleID;
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
            return new UserRole(this);
        }
    }
}
