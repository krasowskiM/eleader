package restauracja.model;


import com.sun.istack.internal.NotNull;


import java.sql.Time;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation {

    @Id
    @Column(name="idReservation")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idReservation;

    @NotNull
    @OneToMany
    @JoinColumn(name="idTable")
    private Tables table;

    @NotNull
    @OneToMany
    @JoinColumn(name="idClient")
    private Client client;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name="startTime", nullable = false)
    private Time startTime;

    @Column(name="endTime", nullable = false)
    private Time endTime;

    @NotNull
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
