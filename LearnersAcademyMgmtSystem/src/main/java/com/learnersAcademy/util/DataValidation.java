package com.learnersAcademy.util;

public class DataValidation {
	
	//This method validates the input data
	/**
	 * 
	 * @param inputString
	 * @return boolean
	 */
	public boolean stringValidation(String inputString) {
		if (inputString == null || inputString.trim().equals("")) {
			return false;
		}
		return true;
	}

}
