package com.weather.springboot.model;

import com.weather.springboot.pojo.CurrentWeather;


public interface ICurrentWeatherService {
	CurrentWeather getCurrentWeather(String city);
}

