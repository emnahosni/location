package dsi32.android.locationapp;

import com.google.android.gms.maps.model.LatLng;

public class UserLocation {
    private LatLng lat_lang;
    private  User user;

    public UserLocation(LatLng lat_lang,User user) {
        this.lat_lang = lat_lang;
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLocation{" +
                "lat_lang=" + lat_lang +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LatLng getLat_lang() {
        return lat_lang;
    }

    public void setLat_lang(LatLng lat_lang) {
        this.lat_lang = lat_lang;
    }

    public UserLocation() {

    }
}
