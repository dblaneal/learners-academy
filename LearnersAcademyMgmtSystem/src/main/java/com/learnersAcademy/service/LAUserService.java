/**
 * 
 */
package com.learnersAcademy.service;

import com.learnersAcademy.bean.LAUserBean;
import com.learnersAcademy.dao.LAUserDao;
import com.learnersAcademy.util.DataValidation;

/**
 * @author anildhaubhadel
 *
 */
public class LAUserService {
	
	// This method performs the login authentication
	/**
	 * 
	 * @param userBean
	 * @return boolean
	 */
	public boolean loginAuthentication(LAUserBean userBean) {
		
		DataValidation dataValidation = new DataValidation();
		if (dataValidation.stringValidation(userBean.getUserName()) && dataValidation.stringValidation(userBean.getPassword())){
			LAUserBean dbUserBean = new LAUserDao().selectUserById(userBean.getUserName());
			return validateUser(userBean, dbUserBean);
		}
		return false;
		
	}
	
	
	
	// This method validates the userName and password for two bean (userBean and dbUserBean)
	/**
	 * 
	 * @param userBean
	 * @param dbUserBean
	 * @return boolean
	 */
	public boolean validateUser(LAUserBean userBean, LAUserBean dbUserBean) {
		if (dbUserBean!=null) {
			if(userBean.getUserName().equals(dbUserBean.getUserName()) && userBean.getPassword().equals(dbUserBean.getPassword())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		LAUserBean userBean = new LAUserBean();
//		userBean.setUserName("admin");
//		userBean.setPassword("admin");
//		
//		boolean result = new LAUserService().loginAuthentication(userBean);
//
//		System.out.println(result);
//
//	}

}
