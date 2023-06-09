package library.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
/**
 * This database connection is currently a placeholder for functionality due to be delivered in future release
 * @author matthewprince
 * @version 1.0
 */
public class LoginDatabaseConnection {
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;

    public static void addUserToDatabase(User userToAdd) {
        openDBSession();
        userToAdd.setUserID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(userToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getUser(int userID) {
        openDBSession();
        Query query = databaseSession.createQuery("from User where userID = " + userID);
        List<?> list = ((Query<?>) query).list();
        closeDBSession();
        return list;
    }

    private static void openDBSession() {
// configure hibernate for application (one per database) & allows creation of sessions
        sessionFactory = new Configuration().configure().buildSessionFactory();
// used to get a physical connection with the database
        databaseSession = sessionFactory.openSession();
    }

    private static void closeDBSession() {
// close session and the session factory instances
        sessionFactory.close();
        databaseSession.close();
        sessionFactory = null;
        databaseSession = null;
    }

    private static int getNextID() {
        Query query = databaseSession.createQuery("select max(userID) from User");
        System.out.println(query.list().get(0));
        return (Integer) query.list().get(0) + 1;
    }
}