package restauracja.response;

/**
 * Created by Maciek on 2017-05-05.
 */
public class TableResponse {
    private int id;
    private String name;
    private int sits;
    private String desc;

    public TableResponse(int id, String name, int sits, String desc) {
        this.id = id;
        this.name = name;
        this.sits = sits;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSits() {
        return sits;
    }

    public String getDesc() {
        return desc;
    }
}
