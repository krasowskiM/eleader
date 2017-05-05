package restauracja.dao;


import restauracja.model.Tables;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface TablesDao {

    void addTable(Tables table);
    void updateTable(Tables table);
    List<Tables> getTables();
    List<Tables> getTablesBySits(int sits);
    List<Tables> getFreeTables(int sits, Date date, Time startTime, Time endTime);
    Tables getTableById(int idTable);
    void deleteTableById(int idTable);

}
