package restauracja.dao;


import restauracja.model.Client;

import java.util.List;

public interface ClientDao {

    void addClient(Client client);
    void updateClient(Client client);
    List<Client> getClients();
    Client getClientById(int idClient);
    List<Client> getClientBySurname(String surname);
    void deleteClientById(int idClient);

}
