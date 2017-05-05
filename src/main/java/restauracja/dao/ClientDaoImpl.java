package restauracja.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import restauracja.configuration.HibernateUtil;
import restauracja.model.Client;

import java.util.List;

public class ClientDaoImpl implements ClientDao {


    public void addClient(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();
        session.close();
    }

    public void updateClient(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(client);
        session.getTransaction().commit();
        session.close();
    }

    public List<Client> getClients() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Client> clients = session.createQuery("from Client").list();
        session.close();
        return clients;
    }

    public Client getClientById(int idClient) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Client client = (Client) session.get(Client.class, idClient);
        session.close();
        return client;
    }

    public List<Client> getClientBySurname(String surname) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Client> clients = (List<Client>) session.createQuery("FROM Client WHERE surname="+surname).list();
        session.close();
        return clients;
    }

    public void deleteClientById(int idClient) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Client client = (Client) session.get(Client.class, idClient);
        session.delete(client);
        session.close();
    }
}
