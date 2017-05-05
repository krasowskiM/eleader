package restauracja.model;

import javax.persistence.*;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Client")
public class Client {

    @Id
    @Column(name="idClient")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idClient;

    @NotEmpty
    @Column(name="name")
    private String name;

    @NotEmpty
    @Column(name="surname")
    private String surname;

    @NotEmpty
    @Column(name="mail")
    private String mail;

    @NotEmpty
    @Column(name="phone")
    private String phone;

    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
