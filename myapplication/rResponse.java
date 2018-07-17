import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Created by appsb on 05-07-2018.
 */
public class rResponse extends rModel {
    @SerializedName("status")
    String status;
    @SerializedName("Restaurant_list")
    List<rModel> Restaurant_list;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<rModel> getRestaurant_list() {
        return Restaurant_list;
    }

    public void setRestaurant_list(List<rModel> restaurant_list) {
        Restaurant_list = restaurant_list;
    }
}
