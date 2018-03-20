package codeclan.com.menuapplication;

import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

public class CapitalCities {

    private ArrayList<City> capitalCities;

    public CapitalCities() {
        capitalCities = new ArrayList<City>();
        capitalCities.add(new City("Paris", "France", R.drawable.paris, R.drawable.french_flag ));
        capitalCities.add(new City("London", "UK",R.drawable.london,R.drawable.british_flag));
        capitalCities.add(new City("Zagreb", "Croatia",R.drawable.zagreb,R.drawable.croatian_flag));
        capitalCities.add(new City("Beijing", "China",R.drawable.beijing,R.drawable.chinese_flag));
        capitalCities.add(new City("Havana", "Cuba",R.drawable.havana,R.drawable.cuban_flag));
        capitalCities.add(new City("Copenhagen", "Denmark",R.drawable.copenhagen,R.drawable.danish_flag));
        capitalCities.add(new City("Tallinn", "Estonia",R.drawable.tallinn,R.drawable.estonian_flag));
        capitalCities.add(new City("Athens", "Greece",R.drawable.athens,R.drawable.greek_flag));
        capitalCities.add(new City("Rome", "Italy",R.drawable.rome,R.drawable.italian_flag));
        capitalCities.add(new City("Riga", "Latvia",R.drawable.riga,R.drawable.latvian_flag));
        capitalCities.add(new City("Tripoli", "Libya",R.drawable.tripoli,R.drawable.libyan_flag));
        capitalCities.add(new City("Valletta", "Malta",R.drawable.valletta,R.drawable.maltese_flag));
        capitalCities.add(new City("Rabat", "Morocco",R.drawable.rabat,R.drawable.morrocan_flag));
        capitalCities.add(new City("Kathmandu", "Nepal",R.drawable.kathmandu,R.drawable.nepalese_flag));
        capitalCities.add(new City("Lima", "Peru",R.drawable.lima,R.drawable.peruvian_flag));
    }

    public ArrayList<City> getCapitalCities() {
        return capitalCities;
    }
}
