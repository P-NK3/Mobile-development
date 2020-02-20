package com.example.weather33;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

//API
public class WeatherAPI{
    public static String KEY = "d0314b00857a592470342efc0e1021a0";
    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    private static Retrofit retrofit = null;

    public interface ApiInterface{
        @GET("weather")
        retrofit2.Call<WeatherDay> getToday(@Query("lat") Double lat, @Query("lon") Double lon, @Query("units") String units, @Query("appid") String appid);

        @GET("forecast")
        Call<WeatherForecast> getForecast(@Query("lat") Double lat, @Query("lon") Double lon, @Query("units") String units, @Query("appid") String appid);

    }
    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;

    }
}
