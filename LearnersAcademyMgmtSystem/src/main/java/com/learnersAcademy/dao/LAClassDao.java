package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.learnersAcademy.bean.LAClassBean;
import com.learnersAcademy.util.DBConnection;

/**
 * 
 * @author anildhaubhadel
 *
 */
public class LAClassDao {

// Method responsible for get all available class
/**
 * 
 * @return list
 */
	public List<LAClassBean> selectAllClass(){
		List<LAClassBean> classList = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_ALL_CLASS_QUERY);
				ResultSet rs = stmt.executeQuery();
				classList = new ArrayList<LAClassBean>();
				while(rs.next()) {
					
					String classId = rs.getString(LADaoConstants.CLASS_ID_COLUMN);
					String className = rs.getString(LADaoConstants.CLASS_NAME_COLUMN);
					classList.add(new LAClassBean(classId, className));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classList;
				
	}
	// Method responsible getting class info by id
	/**
	 * 
	 * @param id
	 * @return ClasBean object
	 */
	public LAClassBean selectClassById(String id) {
		LAClassBean bean = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_CLASS_BY_ID_QUERY);
				stmt.setString(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();
			
				while(rs.next()) {
					
					String classId = rs.getString(LADaoConstants.CLASS_ID_COLUMN);
					String className = rs.getString(LADaoConstants.CLASS_NAME_COLUMN);
					
					bean = new LAClassBean(classId, className);				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	// Method responsible for inserting data into DB
	/**
	 * 
	 * @param bean
	 * @return integer
	 */
	public int insertClass(LAClassBean bean) {
		Connection conn = null;
		int status =  LADaoConstants.Number_0;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
			
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_CLASS_QUERY);
				
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getClassId());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getClassName());
			
				status = pstmt.executeUpdate();

				if (status > LADaoConstants.Number_0) {
					System.out.println("Data Inserted successfully!!");

				} else {
					System.out.println("something went wrong while inserting!!");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	// Method responsible for updating data into DB
	/**
	 * 
	 * @param bean
	 * @return boolean
	 */
	public boolean updateClass(LAClassBean bean) {
		Connection conn = null;
		boolean rowUpdated = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.UPDATE_CLASS_QUERY);
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getClassName());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getClassId());
					
				rowUpdated = pstmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
	
	//Method responsible for deleting data
	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteClass(String id) {
		Connection conn = null;
		boolean rowDeleted = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.DELETE_CLASS_QUERY);
				stmt.setString(LADaoConstants.NUMBER_1, id);;
				
				rowDeleted = stmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
}
