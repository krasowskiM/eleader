package restauracja.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import restauracja.model.Reservation;

/**
 * Created by Maciek on 2017-05-05.
 */
public interface ReservRepository extends JpaRepository<Reservation, Integer> {
}
