package library.system;

import javax.persistence.*;
@Entity
public class User
{
    private int employeeID;
    private String name;
    private int passwordPIN;
    private int supervisor;

    @Id
    public int getEmployeeID()
    {
        return employeeID;
    }
    public void setEmployeeID(int newID)
    {
        employeeID = newID;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }

    public int getPasswordPIN()
    {
        return passwordPIN;
    }
    public void setPasswordPIN(int newPasswordPIN)
    {
        passwordPIN = newPasswordPIN;
    }
    public int getSupervisor()
    {
        return supervisor;
    }
    public void setSupervisor(int newSupervisor)
    {
        supervisor = newSupervisor;
    }
}