package library.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class FilmDatabaseConnection
{
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;
    public static void addFilmToDatabase(Film filmToAdd)
    {
        openDBSession();
        filmToAdd.setFilmID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(filmToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getFilm(int filmID)
    {
        openDBSession();
        Query query = databaseSession.createQuery("from Film where filmID = "+filmID);
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
        Query query = databaseSession.createQuery("select max(filmID) from Film");
        System.out.println( query.list().get(0));
        return (Integer) query.list().get(0)+1;
    }
}