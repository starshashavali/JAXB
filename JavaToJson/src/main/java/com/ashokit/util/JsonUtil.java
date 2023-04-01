package com.ashokit.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	public static String  convertJavaToJson(Object object) {
		String jsonResult="";
		try {
		jsonResult=mapper.writeValueAsString(object);
		}catch(JsonGenerationException e) {
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());
			e.printStackTrace();
			
		}catch(JsonMappingException e) {
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());

			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());

		}
		return jsonResult;
		
		
	}
	public static <T> T convertJsonToJava(String jsonString,Class<T>cls) {
		T result=null;
		try {
		result=mapper.readValue(jsonString, cls);
		}catch(JsonGenerationException e) {
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());
			e.printStackTrace();
		}catch(JsonMappingException e) {
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());

			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Exceptin occured in converting java into json"+e.getMessage());

		}
				return result;
	}
}
