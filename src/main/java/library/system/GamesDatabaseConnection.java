package library.system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GamesDatabaseConnection
{
    static Session databaseSession = null;
    static SessionFactory sessionFactory = null;
    public static void addGamesToDatabase(Games gamesToAdd)
    {
        openDBSession();
        gamesToAdd.setGamesID(getNextID());
        databaseSession.beginTransaction();
        databaseSession.persist(gamesToAdd);
        databaseSession.getTransaction().commit();
        closeDBSession();
    }

    public static List<?> getGames(int gamesID)
    {
        openDBSession();
        Query query = databaseSession.createQuery("from Games where gamesID = "+gamesID);
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
        Query query = databaseSession.createQuery("select max(gamesID) from Games");
        System.out.println( query.list().get(0));
        return (Integer) query.list().get(0)+1;
    }
}