package restauracja.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import restauracja.configuration.HibernateUtil;
import restauracja.model.Admin;

import java.util.List;

public class AdminDaoImpl implements AdminDao {

    @Override
    public void addAdmin(Admin admin) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(admin);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateAdmin(Admin admin) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(admin);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Admin> getAdmins() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Admin> admins = session.createQuery("from Admin").list();
        session.close();
        return admins;
    }

    @Override
    public Admin getAdminById(int idAdmin) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Admin admin = (Admin) session.get(Admin.class, idAdmin);
        session.close();
        return admin;
    }

    @Override
    public void deleteAdminById(int idAdmin) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Admin admin = (Admin) session.get(Admin.class, idAdmin);
        session.delete(admin);
        session.close();
    }
}
