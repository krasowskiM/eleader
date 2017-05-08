package restauracja.model;


import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idReservation;

//    @NotNull
    @ManyToOne(targetEntity = Tables.class)
    @JoinColumn(name="table_id")
    private Tables table;

//    @NotNull
    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name="client_id")
    private Client client;

    @Column(name = "res_date", nullable = false)
    private Date resDate;

//    @NotNull
    @Column(name="status")
    private boolean status;


    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Tables getTables() {
        return table;
    }

    public void setTables(Tables table) {
        this.table = table;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getResDate() {
        return resDate;
    }

    public void setResDate(Date resDate) {
        this.resDate = resDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
