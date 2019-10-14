package com.weather.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.weather.springboot.pojo.CityProperties;

@Controller
public class CityController {

	@Autowired
    private CityProperties cityProperties;
	
	@GetMapping("/")
	public String index(Model model) {
        model.addAttribute("cities", cityProperties.cities);
		return "index";
	}
	
	// it just for my test, should not be left
	/*@GetMapping("/hello")
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "hello";
	}*/

}
