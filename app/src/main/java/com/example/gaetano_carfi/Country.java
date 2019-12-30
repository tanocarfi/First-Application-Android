package com.example.gaetano_carfi;

import java.io.Serializable;

public class Country implements Serializable {
    private int name;
    private int logo;
    private int area;
    private int population;

    public Country(int name, int logo, int area, int population) {
        this.name = name;
        this.logo = logo;
        this.area = area;
        this.population = population;
    }

    public int getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

    public int getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }
}
