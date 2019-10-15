package com.weather.springboot.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Data;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Getter
public class Wind implements Serializable {

	private static final long serialVersionUID = -6736795365614126967L;

	@XmlElement
	public Value speed;

	@XmlElement
	public Value direction;

}

