package com.weather.springboot.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: CL
 * @Date: 2019/10/14
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "cityConfig")
@Data
@Getter
@Setter
public class CityProperties {

	public String[] cities;
}
