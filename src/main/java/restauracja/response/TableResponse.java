package restauracja.response;

import restauracja.model.Tables;

import java.util.List;

/**
 * Created by Maciek on 2017-05-05.
 */
public class TableResponse {

    private List<Tables> tables;

    public TableResponse(List<Tables> tables) {
        this.tables = tables;
    }

    public List<Tables> getTables() {
        return tables;
    }
}
