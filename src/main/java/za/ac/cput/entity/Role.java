package za.ac.cput.entity;

public class Role
{
 /*
    za.ac.cput.Domain.Role.java
    Entity for za.ac.cput.Domain.Role
    Author: Jesse Merold Hiebner (220357676)
    Date: 09 April 2022
*/
    private int roleID;
    private String Admin;
    private String silverMember;
    private String goldMember;
    private String vipMember;

    //default
    public Role(){}

    private Role(Builder builder)
    {
        this.roleID = builder.roleID;
        this.Admin = builder.Admin;
        this.silverMember = builder.silverMember;
        this.goldMember = builder.GoldMember;
        this.vipMember = builder.VipMember;
    }

    //Getters
    public int getRoleID()
    {
        return roleID;
    }
    public String getAdmin()
    {
        return Admin;
    }
    public String getSilverMember(){return silverMember;}
    public String getGoldMember()
    {
        return goldMember;
    }
    public String getVipMember(){return vipMember;}

    //Setters
    public void setRoleID(int roleID)
    {
        this.roleID = roleID;
    }
    public void setAdmin(String admin)
    {
        Admin = admin;
    }
    public void setSilverMember(String silverMember)
    {
        this.silverMember = silverMember;
    }
    public void setGoldMember(String goldMember)
    {
        this.goldMember = goldMember;
    }
    public void setVipMember(String vipMember)
    {
        this.vipMember = vipMember;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", Admin='" + Admin + '\'' +
                ", silverMember='" + silverMember + '\'' +
                ", goldMember='" + goldMember + '\'' +
                ", vipMember='" + vipMember + '\'' +
                '}';
    }

    //Builder
    public static class Builder
    {
        public int roleID;
        public String silverMember;
        private int RoleID;
        private String Admin;
        private String SilverMember;
        private String GoldMember;
        private String VipMember;

        public Builder setRoleID(int RoleID)
        {
            this.RoleID = RoleID;
            return this;
        }

        public Builder setAdmin(String Admin)
        {
            this.Admin = Admin;
            return this;
        }

        public Builder setSilverMember(String SilverMember)
        {
            this.SilverMember = SilverMember;
            return this;
        }

        public Builder setGoldMember(String GoldMember)
        {
            this.GoldMember = GoldMember;
            return this;
        }

        public Builder setVipMember(String VipMember)
        {
            this.VipMember = VipMember;
            return this;
        }

        public Role build()
        {
            return new Role(this);
        }
    }
}
