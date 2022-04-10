/*
Login.java
Entity for Login
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/

package za.ac.cput.entity;

public class Login {

    private String email;
    private String password;

    //Default Constructor
    private Login() {}

    //Builder Class
    private Login (Builder builder) {

        this.email = builder.email;
        this.password = builder.password;

    }

    //Getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //Builder Class
    public static class Builder {

        private String email;
        private String password;

        public Builder setEmail(String Email) {
            this.email = Email;
            return this;
        }

        public Builder setPassword(String Password) {
            this.password = Password;
            return this;
        }

        public Login build() {
            return new Login(this);
        }
    }


}
