package codeclan.com.menuapplication;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by user on 20/03/2018.
 */

public class City implements Serializable {

    private String name;
    private String country;
    private int cityImage;
    private int countryFlag;


    public City (String name, String country, int cityImage, int countryFlag) {
        this.country = country;
        this.name = name;
        this.cityImage = cityImage;
        this.countryFlag = countryFlag;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getCityImage() {
        return cityImage;
    }

    public int getCountryFlag() {
        return countryFlag;
    }
}
