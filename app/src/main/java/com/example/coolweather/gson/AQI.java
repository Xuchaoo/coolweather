package com.example.coolweather.gson;

/**
 * Created by Xuchao’ on 2018/11/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
