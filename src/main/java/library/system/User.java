package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * This class models the system users that are authorised to access and operate the library system. Users have a
 * unique user ID, a unique username, a first name, a surname, a 4-digit PIN and if they are a supervisor.
 *
 * @author matthewprince
 * @version 1.0
 */
@Entity
public class User {
    private int userID;
    private String userName;
    private String firstName;
    private String lastName;
    private String passwordPIN;
    private String supervisor;

    /**
     * @param uID the unique ID of the user
     * @param uName the unique username used for login
     * @param uFName the users first name
     * @param uLName the users last name
     * @param uPIN the users PIN, used to verify login
     * @param uSupervisor the supervisor status (Yes = Supervisor, No = Non-Supervisor)
     */
    public User(int uID, String uName, String uFName, String uLName, String uPIN, String uSupervisor){
        userID = uID;
        userName = uName;
        firstName = uFName;
        lastName = uLName;
        passwordPIN = uPIN;
        supervisor = uSupervisor;
    }

    public User(){

    }
    /**
     * Gets the ID of the User
     *
     * @return the ID of the User
     */
    @Id
    public int getUserID() {
        return userID;
    }
    /**
     * Setting the User ID is controlled by the controller, this increments the most recent User ID by 1
     */
    public void setUserID(int newID) {
        userID = newID;
    }
    /**
     * Gets the Username of the User
     *
     * @return the Username of the User
     */
    public String getUserName() {
        return userName;
    }
    /**
     * Sets the Username of the User
     */
    public void setUserName(String newUserName) {
        userName = newUserName;
    }
    /**
     * Gets the First Name of the User
     *
     * @return the First Name of the User
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets the First Name of the User
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    /**
     * Gets the Last Name of the User
     *
     * @return the Last Name of the User
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Sets the Last Name of the User
     */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    /**
     * Gets the PIN of the User
     *
     * @return the PIN of the User
     */
    public String getPasswordPIN() {
        return passwordPIN;
    }
    /**
     * Sets the PIN of the User
     */
    public void setPasswordPIN(String newPasswordPIN) {
        passwordPIN = newPasswordPIN;
    }
    /**
     * Gets the supervisor status of the User
     *
     * @return the supervisor status of the User
     */
    public String getSupervisor() {
        return supervisor;
    }
    /**
     * Sets the supervisor status of the User
     */
    public void setSupervisor(String newSupervisor) {
        supervisor = newSupervisor;
    }
}