package util;

import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericMethods {

	/** Convert Json to Data Model */
	public static Map<String, String> convertModelToHashMap(Object c) {
		Map<String, String> map = null;

		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = convertModelToJSon(c);// mapper.writeValueAsString(c);

			map = mapper.readValue(json, Map.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return map;
	}

	/** Convert Model to Json */
	public static String convertModelToJSon(Object c) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);
			String json = mapper.writeValueAsString(c);

			return json;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static String generateRandomEmail () {
		int length = 10;
	    boolean useLetters = true;
	    boolean useNumbers = false;
	    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

	    System.out.println(generatedString);
	    return generatedString+"@gmail.com";
	}

}
