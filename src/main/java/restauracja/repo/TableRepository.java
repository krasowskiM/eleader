package restauracja.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import restauracja.model.Tables;

/**
 * Created by Maciek on 2017-05-05.
 */
public interface TableRepository extends JpaRepository<Tables, Integer> {
}
