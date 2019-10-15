package com.weather.springboot.util;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class Utils {

	public static String dateFormat(String dateVal) {
		TemporalAccessor temporal = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", Locale.US).parse(dateVal);
		return DateTimeFormatter.ofPattern("EEEE HH:mm a", Locale.US).format(temporal);
	}

	public static String speedFormat(String speedVal) {
		return String.valueOf(Math.round(3.6 * Double.valueOf(speedVal))) + "km/h";
	}

	public static String tempFormat(String tempVal) {
		return String.valueOf(Math.round(Double.valueOf(tempVal) - 273.15)) + "°C";
	}
}
