package codeclan.com.menuapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 20/03/2018.
 */

public class CapitalCityAdaptor extends ArrayAdapter<City> {

    public CapitalCityAdaptor(Context context, List<City> cities) {
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        City currentCity = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.city_item, parent, false);
        }

        TextView cityName = listItemView.findViewById(R.id.city_name);
        cityName.setText(currentCity.getName());
        TextView countryName = listItemView.findViewById(R.id.county_name);
        countryName.setText(currentCity.getCountry());
//        ImageView cityImage = listItemView.findViewById(R.id.paris_img);
//        cityImage.setImageResource(currentCity.getCityImage());
        return listItemView;
    }
}
