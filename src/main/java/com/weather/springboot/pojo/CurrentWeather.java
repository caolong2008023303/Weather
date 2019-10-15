package com.weather.springboot.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;

@XmlRootElement(name = "current")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Getter
public class CurrentWeather implements Serializable {

	private static final long serialVersionUID = 1552770063252946514L;

	public String city;

	@XmlElement
	public Value temperature;

	@XmlElement
	public Wind wind;

	@XmlElement
	public Value weather;

	@XmlElement
	public Value lastupdate;

}
