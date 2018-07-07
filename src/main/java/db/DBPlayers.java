package db;

import Models.Player;
import Models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBPlayers {

//    private static Transaction transaction;
//    private static Session session;
//
//    public static List<Player> getAllPlayersInTeam(Team team){
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<Player> results = null;
//
//        try {
//            Criteria cr = session.createCriteria(Player.class);
//            cr.add(Restrictions.eq("team", team));
//            results = cr.list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return results;
//    }
}
