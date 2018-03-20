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
//        capitalCities.add(new City("Beijing", "China"));
//        capitalCities.add(new City("Havana", "Cuba"));
//        capitalCities.add(new City("Copenhagen", "Denmark"));
//        capitalCities.add(new City("Tallinn", "Estonia"));
//        capitalCities.add(new City("Athens", "Greece"));
//        capitalCities.add(new City("Rome", "Italy"));
//        capitalCities.add(new City("Riga", "Latvia"));
//        capitalCities.add(new City("Tripoli", "Libya"));
//        capitalCities.add(new City("Valletta", "Malta"));
//        capitalCities.add(new City("Rabat", "Morocco"));
//        capitalCities.add(new City("Kathmandu", "Nepal"));
//        capitalCities.add(new City("Lima", "Peru"));
    }

    public ArrayList<City> getCapitalCities() {
        return capitalCities;
    }
}
