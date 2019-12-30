package com.example.gaetano_carfi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {
    public ImageView image;
    public TextView text;
    public Country country;
    public TextView area;
    public TextView population;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.country = (Country) getIntent().getSerializableExtra("country");

        this.image = findViewById(R.id.country_imageSecond);
        image.setImageResource(country.getLogo());

        this.text = findViewById(R.id.country_title);
        text.setText(country.getName());

        this.area = findViewById(R.id.country_area);
        area.setText(country.getArea());

        this.population = findViewById(R.id.country_population);
        population.setText(country.getPopulation());
    }
}
