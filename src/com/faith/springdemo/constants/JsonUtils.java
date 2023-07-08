package com.faith.springdemo.constants;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	public static <T> String toJson(T jsonObject) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		try {
			return mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> T fromJson(String jsonString, Class<T> t) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(jsonString, t);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}