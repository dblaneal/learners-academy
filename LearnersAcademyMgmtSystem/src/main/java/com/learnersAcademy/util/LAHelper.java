package com.learnersAcademy.util;

public class LAHelper {
	
	public static String[] splitString(String str) {
		
		String[] parts = str.split("/");
		parts[1] = parts[1].trim();

		return parts;
	}
}
