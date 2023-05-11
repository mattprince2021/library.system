package library.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class TablesDatabaseConnection
{
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;
    public static void addTablesToDatabase(Tables tablesToAdd)
    {
        openDBSession();
        tablesToAdd.setTablesID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(tablesToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getTables(int tablesID)
    {
        openDBSession();
        Query query = databaseSession.createQuery("from Tables where tablesID = "+tablesID);
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
        Query query = databaseSession.createQuery("select max(tablesID) from Tables");
        System.out.println( query.list().get(0));
        return (Integer) query.list().get(0)+1;
    }
}