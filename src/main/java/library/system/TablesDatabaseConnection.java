package library.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * This database connector opens a connection to the relevant database and writes the data, then closes the connection.
 * The data in the controller data entry fields are aligned to the class. Included are a submission button, a button to
 * return to the home screen and a button to exit the program.
 *
 * @author matthewprince
 * @version 1.0
 */
public class TablesDatabaseConnection {
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;

    public static void addTablesToDatabase(Tables tablesToAdd) {
        openDBSession();
        tablesToAdd.setTablesID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(tablesToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getTables(int tablesID) {
        openDBSession();
        Query query = databaseSession.createQuery("from Tables where tablesID = " + tablesID);
        List<?> list = ((Query<?>) query).list();
        closeDBSession();
        return list;
    }

    /**
     * Opens the database session
     */
    private static void openDBSession() {
// configure hibernate for application (one per database) & allows creation of sessions
        sessionFactory = new Configuration().configure().buildSessionFactory();
// used to get a physical connection with the database
        databaseSession = sessionFactory.openSession();
    }

    /**
     * Closes the database session
     */
    private static void closeDBSession() {
// close session and the session factory instances
        sessionFactory.close();
        databaseSession.close();
        sessionFactory = null;
        databaseSession = null;
    }

    /**
     * Sets the next ID
     */
    private static int getNextID() {
        Query query = databaseSession.createQuery("select max(tablesID) from Tables");
        System.out.println(query.list().get(0));
        return (Integer) query.list().get(0) + 1;
    }
}