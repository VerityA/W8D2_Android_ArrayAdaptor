package codeclan.com.menuapplication;

import android.content.Intent;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by user on 20/03/2018.
 */

public class City implements Serializable {

    private String name;
    private String country;
    private Integer cityImage;
    private Integer countryFlag;


    public City (String name, String country, Integer cityImage, Integer countryFlag) {
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

    public Integer getCityImage() {
        return cityImage;
    }

    public Integer getCountryFlag() {
        return countryFlag;
    }
}
