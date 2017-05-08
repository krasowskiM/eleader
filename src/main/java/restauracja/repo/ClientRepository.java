package restauracja.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restauracja.model.Client;

/**
 * Created by Maciek on 2017-05-05.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
