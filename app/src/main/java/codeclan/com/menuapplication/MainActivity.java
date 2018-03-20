package codeclan.com.menuapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CapitalCities cities = new CapitalCities();
        ArrayList<City> cityList = cities.getCapitalCities();

        CapitalCityAdaptor cityAdaptor = new CapitalCityAdaptor(this, cityList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(cityAdaptor);

    }


    public void onListClickView(View listItem) {
        City selectedCity = (City) listItem.getTag();
        Intent intent = new Intent(this, CityActivity.class);
        intent.putExtra("city", selectedCity);
        startActivity(intent);
    }


}
