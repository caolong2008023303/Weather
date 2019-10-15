package com.weather.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.weather.springboot.model.ICurrentWeatherService;
import com.weather.springboot.pojo.CurrentWeather;


@Service
public class CurrentWeatherService implements ICurrentWeatherService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CurrentWeather getCurrentWeather(String city) {
		// should set this url in config file
		// and check error about the response status
		String url = "https://api.openweathermap.org/data/2.5/weather?mode=xml&appid=c705bebd5fbc46cb2497485eca9b99e2&q=" + city;
		return restTemplate.getForObject(url, CurrentWeather.class);
	}
}

