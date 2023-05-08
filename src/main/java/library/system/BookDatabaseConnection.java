package library.system;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class BookDatabaseConnection
{
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;
    public static void addBookToDatabase(Book bookToAdd)
    {
        openDBSession();
        bookToAdd.setBookID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(bookToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getBook(int bookID)
    {
        openDBSession();
        javax.management.Query query = (javax.management.Query) databaseSession.createQuery("from bookTable where bookID = "+bookID);
        List<?> list = ((Query<?>) query).list();
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