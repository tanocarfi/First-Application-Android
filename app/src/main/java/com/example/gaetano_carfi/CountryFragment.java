package com.example.gaetano_carfi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class CountryFragment extends Fragment {
    private RecyclerView countryRecyclerView;
    private static final int EXTRA_CODE = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_country, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        countryRecyclerView = view.findViewById(R.id.country_recycler_view);
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
    }

    private void updateUI() {
        CountryLab programmingLab = CountryLab.get(getActivity());
        List<Country> countries = programmingLab.getCountries();

        CountryAdapter adapter = new CountryAdapter(countries);
        countryRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    private class CountryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView;
        private ImageView imageView;
        private Country country;

        public CountryHolder(LayoutInflater inflater, ViewGroup parent) {
            super (inflater.inflate(R.layout.list_item_country, parent, false));

            textView = itemView.findViewById(R.id.country_name);
            imageView = itemView.findViewById(R.id.country_image);
            itemView.setOnClickListener(this);
        }

        public void bind(Country newCountry) {
            country = newCountry;
            textView.setText(country.getName());
            imageView.setImageResource(country.getLogo());
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), DetailsActivity.class);
            intent.putExtra("country",(Serializable) country);
            startActivityForResult(intent, EXTRA_CODE);
        }
    }

    private class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {
        private List<Country> countries;

        public CountryAdapter(List<Country> countryList) {
            countries = countryList;
        }

        @NonNull
        @Override
        public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new CountryHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
            Country countryAt = countries.get(position);
            holder.bind(countryAt);
        }

        @Override
        public int getItemCount() {
            return countries.size();
        }
    }
}
