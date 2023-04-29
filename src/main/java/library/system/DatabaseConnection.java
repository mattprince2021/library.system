
package library.system;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;
public class DatabaseConnection
{
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;
    public static void addEmployeeToDatabase(Employee employeeToAdd)
    {
        openDBSession();
        employeeToAdd.setEmployeeID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(employeeToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }
    public static List<?> getEmployee(int employeeID)
    {
        openDBSession();
        Query query = databaseSession.createQuery("from Employee where employeeID = "+employeeID);
        List<?> list = query.list();
        closeDBSession();
        return list;
    }
    private static void openDBSession()
    {
// configure hibernate for application (one per database) & allows creation of sessions
        sessionFactory = new Configuration().configure().buildSessionFactory();
// used to get a physical connection with the database
        databaseSession = sessionFactory.openSession();
    }
    private static void closeDBSession()
    {
// close session and the session factory instances
        sessionFactory.close();
        databaseSession.close();
        sessionFactory = null;
        databaseSession = null;
    }
    private static int getNextID()
    {
        Query query = databaseSession.createQuery("select max(employeeID) from Employee");
        System.out.println( query.list().get(0));
        return (Integer) query.list().get(0)+1;
    }
}