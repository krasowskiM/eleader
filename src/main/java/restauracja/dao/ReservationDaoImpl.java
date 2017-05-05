package restauracja.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import restauracja.configuration.HibernateUtil;
import restauracja.model.Client;
import restauracja.model.Reservation;

import java.util.List;

public class ReservationDaoImpl implements ReservationDao {


    public void addReservation(Reservation reservation) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(reservation);
        session.getTransaction().commit();
        session.close();
    }

    public void updateReservation(Reservation reservation) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(reservation);
        session.getTransaction().commit();
        session.close();
    }

    public List<Reservation> getReservations() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Reservation> reservations = session.createQuery("from Reservation").list();
        session.close();
        return reservations;
    }

    public List<Reservation> getTableReservation(int idTable) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Reservation> reservations = (List<Reservation>) session.createQuery("FROM Reservation WHERE idTable="+idTable).list();
        session.close();
        return reservations;
    }

    public Reservation getReservationById(int idReservation) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Reservation reservation = (Reservation) session.get(Reservation.class, idReservation);
        session.close();
        return reservation;
    }
}
