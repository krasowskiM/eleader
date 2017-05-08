package restauracja.model;

import javax.persistence.*;

@Entity
@Table(name="tables")

public class Tables {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

//    @NotEmpty
    @Column(name="seats")
    private int seats;

//    @NotEmpty
    @Column(name="name")
    private String name;

//    @NotEmpty
    @Column(name="desc")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
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
