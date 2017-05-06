package restauracja.response;

/**
 * Created by Maciek on 2017-05-06.
 */
public class IphoneResponse {
    private boolean status;

    public IphoneResponse(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
