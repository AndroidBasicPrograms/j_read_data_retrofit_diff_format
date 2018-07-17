
import com.google.gson.annotations.SerializedName;

/**
 * Created by appsb on 05-07-2018.
 */

public class rModel {
//    @SerializedName("id")
//    String id;
//
//    @SerializedName("currency")
//    String currency;
//
//    @SerializedName("lat")
//    String lat;
//
//    @SerializedName("lon")
//    String lon;
//
//    @SerializedName("Category")
//    String[] Category;
//
//    @SerializedName("distance")
//    String distance;
//
//    @SerializedName("res_status")
//    String res_status;

    @SerializedName("open_time")
    String  open_time;

//    @SerializedName("close_time")
//    String close_time;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(String currency) {
//        this.currency = currency;
//    }
//
//    public String getLat() {
//        return lat;
//    }
//
//    public void setLat(String lat) {
//        this.lat = lat;
//    }
//
//    public String getLon() {
//        return lon;
//    }
//
//    public void setLon(String lon) {
//        this.lon = lon;
//    }
//
//    public String[] getCategory() {
//        return Category;
//    }
//
//    public void setCategory(String[] category) {
//        Category = category;
//    }
//
//    public String getDistance() {
//        return distance;
//    }
//
//    public void setDistance(String distance) {
//        this.distance = distance;
//    }
//
//    public String getRes_status() {
//        return res_status;
//    }
//
//    public void setRes_status(String res_status) {
//        this.res_status = res_status;
//    }
//
    public String getOpen_time() {
        return open_time;
    }
//
    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

//    public String getClose_time() {
//        return close_time;
//    }
//
//    public void setClose_time(String close_time) {
//        this.close_time = close_time;
//    }
//
//    public String getDelivery_charge() {
//        return delivery_charge;
//    }
//
//    public void setDelivery_charge(String delivery_charge) {
//        this.delivery_charge = delivery_charge;
//    }
//
//    @SerializedName("delivery_charge")
//    String delivery_charge;

    @SerializedName("image")
    String image;
    @SerializedName("name")
    String name;
    @SerializedName("delivery_time")
    String delivery_time;
    @SerializedName("ratting")
    String ratting;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getRatting() {
        return ratting;
    }

    public void setRatting(String ratting) {
        this.ratting = ratting;
    }
}
