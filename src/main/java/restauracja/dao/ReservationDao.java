package restauracja.dao;


import restauracja.model.Reservation;

import java.util.List;

public interface ReservationDao {

    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    List<Reservation> getReservations();
    List<Reservation> getTableReservation(int idTable);
    Reservation getReservationById(int idReservation);



}
