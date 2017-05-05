package restauracja.dao;


import restauracja.model.Admin;

import java.util.List;

public interface AdminDao {

    void addAdmin(Admin admin);
    void updateAdmin(Admin admin);
    List<Admin> getAdmins();
    Admin getAdminById(int idAdmin);
    void deleteAdminById(int idAdmin);


}
