package restauracja.service;

//import com.common.model.TableResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restauracja.model.Tables;
import restauracja.repo.TableRepository;

import java.util.List;

/**
 * Created by Maciek on 2017-05-05.
 */
@Service
public class TableService {

    private TableRepository tableRepository;

    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @Transactional(readOnly = true)
    public List<Tables> findAll(){
        return tableRepository.findAll();
    }
}
