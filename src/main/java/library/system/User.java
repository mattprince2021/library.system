package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private int userID;
    private String userName;
    private String firstName;
    private String lastName;
    private String passwordPIN;
    private String supervisor;

    @Id
    public int getUserID() {
        return userID;
    }

    public void setUserID(int newID) {
        userID = newID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String newUserName) {
        userName = newUserName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getPasswordPIN() {
        return passwordPIN;
    }

    public void setPasswordPIN(String newPasswordPIN) {
        passwordPIN = newPasswordPIN;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String newSupervisor) {
        supervisor = newSupervisor;
    }
}