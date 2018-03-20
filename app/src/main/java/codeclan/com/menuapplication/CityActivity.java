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

        Intent intent = getIntent();
        City selectedCity = (City) intent.getSerializableExtra("city");


        ImageView cityImage = findViewById(R.id.city_image);
        cityImage.setImageResource(selectedCity.getCityImage());
        ImageView countryFlag = findViewById(R.id.country_flag);
        countryFlag.setImageResource(selectedCity.getCountryFlag());


    }
}
