package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;  // 成功返回ok, 失败返回具体的原因

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    // @SerializedName使JSON字段和Java字段之间建立映射关系
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;  // 数组中的每一项代表未来一天的天气信息

}
