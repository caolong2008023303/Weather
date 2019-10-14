package com.weather.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("weather")
public class WeatherController {

    @GetMapping("/current")
    public String web1(Model model){
        return "weather";
    }
}
