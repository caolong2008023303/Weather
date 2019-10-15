package com.weather.springboot.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.Data;
import lombok.Getter;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Getter
public class Value implements Serializable {

	private static final long serialVersionUID = -2237664666761910519L;

	@XmlAttribute
	public String value;

}

