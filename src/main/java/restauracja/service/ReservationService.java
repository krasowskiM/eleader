package restauracja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restauracja.model.Reservation;
import restauracja.repo.ReservRepository;
import restauracja.request.ReservationRequest;

/**
 * Created by Maciek on 2017-05-07.
 */
@Service
public class ReservationService {

    private ReservRepository reservRepository;

    @Autowired
    public ReservationService(ReservRepository reservRepository) {
        this.reservRepository = reservRepository;
    }

    public void createNewReservation(ReservationRequest reservationRequest){
        reservRepository.save(new Reservation());
    }
}
