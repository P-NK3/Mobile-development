package com.example.weather33;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// файл WeatherForecast.java
public class WeatherForecast {
    @SerializedName("list")
    private List<WeatherDay> items;

    public WeatherForecast(List<WeatherDay> items) {
        this.items = items;
    }

    public List<WeatherDay> getItems() {
        return items;
    }
}
