package restauracja.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name="Reservation")

public class Tables {

    @Id
    @Column(name="idTable")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idTable;

    @NotEmpty
    @Column(name="sits")
    private int sits;

    @NotEmpty
    @Column(name="name")
    private String name;

    @NotEmpty
    @Column(name="description")
    private String description;

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
