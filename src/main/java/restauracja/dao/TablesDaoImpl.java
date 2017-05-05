package restauracja.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import restauracja.configuration.HibernateUtil;
import restauracja.model.Tables;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class TablesDaoImpl implements TablesDao {

    @Override
    public void addTable(Tables table) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(table);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateTable(Tables table) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(table);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Tables> getTables() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tables> tables = session.createQuery("from ables").list();
        session.close();
        return tables;
    }

    @Override
    public List<Tables> getTablesBySits(int sits) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Tables> tables = (List<Tables>) session.createQuery("FROM Tables WHERE sits="+sits).list();
        session.close();
        return tables;
    }

    @Override
    public List<Tables> getFreeTables(int sits, Date date, Time startTime, Time endTime) {
        return null;
    }

    public Tables getTableById(int idTable) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Tables table = (Tables) session.get(Tables.class, idTable);
        session.close();
        return table;
    }

    public void deleteTableById(int idTable) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Tables table = (Tables) session.get(Tables.class, idTable);
        session.delete(table);
        session.close();
    }
}
