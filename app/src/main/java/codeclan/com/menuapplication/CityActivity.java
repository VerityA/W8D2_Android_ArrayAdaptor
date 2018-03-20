package codeclan.com.menuapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        CapitalCities cities = new CapitalCities();
        ArrayList<City> cityList = cities.getCapitalCities();

        Intent intent = getIntent();
        City selectedCity = (City) intent.getSerializableExtra("city");
//        ImageView imageView = (ImageView) findViewById(R.id.paris_img);
//        imageView.setImageResource(selectedCity.getCityImage());

        CapitalCityAdaptor cityAdaptor = new CapitalCityAdaptor(this, cityList);
        ImageView imageView = findViewById(R.id.paris_img);
        imageView.setImageResource(selectedCity.getCityImage());
    }
}
