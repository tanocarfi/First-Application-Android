package com.example.gaetano_carfi;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class CountryLab {
    private static CountryLab instance;
    private List<Country> countries;

    public static CountryLab get(Context context) {
        if (instance == null) {
            instance = new CountryLab(context);
        }
        return instance;
    }

    private CountryLab (Context context) {
        countries = new ArrayList<>();

        Country francia = new Country(R.string.country_francia, R.drawable.bandiera_francia, R.string.area_francia, R.string.population_francia);
        countries.add(francia);

        Country cechia = new Country(R.string.country_cechia, R.drawable.bandiera_cechia, R.string.area_cechia, R.string.population_cechia);
        countries.add(cechia);

        Country grecia = new Country(R.string.country_grecia, R.drawable.bandiera_grecia, R.string.area_grecia, R.string.population_grecia);
        countries.add(grecia);

        Country bulgaria = new Country(R.string.country_bulgaria, R.drawable.bandiera_bulgaria, R.string.area_bulgaria, R.string.population_bulgaria);
        countries.add(bulgaria);

        Country spagna = new Country(R.string.country_spagna, R.drawable.bandiera_spagna, R.string.area_spagna, R.string.population_spagna);
        countries.add(spagna);

        Country polonia = new Country(R.string.country_polonia, R.drawable.bandiera_polonia, R.string.area_polonia, R.string.population_polonia);
        countries.add(polonia);

        Country malta = new Country(R.string.country_malta, R.drawable.bandiera_malta, R.string.area_malta, R.string.population_malta);
        countries.add(malta);

        Country italia = new Country(R.string.country_italia, R.drawable.bandiera_italia, R.string.area_italia, R.string.population_italia);
        countries.add(italia);

        Country romania = new Country(R.string.country_romania, R.drawable.bandiera_romania, R.string.area_romania, R.string.population_romania);
        countries.add(romania);

        Country finlandia = new Country(R.string.country_finlandia, R.drawable.bandiera_finlandia, R.string.area_finlandia, R.string.population_finlandia);
        countries.add(finlandia);
    }

    public List<Country> getCountries() {return countries;}
}
