package com.weather.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weather.springboot.pojo.CurrentWeather;
import com.weather.springboot.service.CurrentWeatherService;
import com.weather.springboot.util.Utils;


@Controller
@RequestMapping("weather")
public class WeatherController {

	@Autowired
	private CurrentWeatherService currentWeatherService;
	
	@GetMapping("/current/{city}")
	public String currentWeather(Model model, @PathVariable("city") String city) {
		CurrentWeather current = currentWeatherService.getCurrentWeather(city);
		// should format in the service
		current.city = city;
		current.lastupdate.value = Utils.dateFormat(current.lastupdate.value);
		current.temperature.value = Utils.tempFormat(current.temperature.value);
		current.wind.speed.value = Utils.speedFormat(current.wind.speed.value);

		model.addAttribute("current", current);
		return "weather";
	}
}

