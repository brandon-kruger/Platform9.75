package za.ac.cput.entity;

public class User
{
/*
    za.ac.cput.Domain.User.java
    Entity for za.ac.cput.Domain.User
    Author: Jesse Merold Hiebner (220357676)
    Date: 09 April 2022
*/
    private String name;
    private String surname;
    private String email;
    private String cellNumber;
    private String dateOfBirth;

    //default class
    public User() {}

    //builder class
    private User (Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.cellNumber = builder.cellNumber;
        this.dateOfBirth = builder.dateOfBirth;
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getEmail()
    {
        return email;
    }
    public String getCellNumber()
    {
        return cellNumber;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setCellNumber(String cellNumber)
    {
        this.cellNumber = cellNumber;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public static class Builder
    {
        private String name;
        private String surname;
        private String email;
        private String cellNumber;
        private String dateOfBirth;

        public Builder setName(String Name)
        {
            this.name = Name;
            return this;
        }

        public Builder setSurname(String Surname)
        {
            this.surname = Surname;
            return this;
        }

        public Builder setEmail(String Email)
        {
            this.email = Email;
            return this;
        }

        public Builder setCellNumber(String CellNumber)
        {
            this.cellNumber = CellNumber;
            return this;
        }

        public Builder setDateOfBirth(String DateOfBirth)
        {
            this.dateOfBirth = DateOfBirth;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }
}
