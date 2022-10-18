package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.learnersAcademy.bean.LAUserBean;
import com.learnersAcademy.util.DBConnection;

/**
 * @author anildhaubhadel
 * @version 1.0
 *
 */

public class LAUserDao {
	
	// This method gets the user details as per user id provide by the user.
	
	/**
	 * @param userId
	 * @return LAUserBean object
	 */
	public LAUserBean selectUserById(String uName) {
		Connection conn = null;
		LAUserBean userBean = null;
		try {
			// Try to get Database connection from DBConnection class
			conn = DBConnection.getConnection();
			
			if(conn != null) {
				String sqlQuery = LADaoConstants.SELECT_USER_WHERE_ID_QUERY+"'"+uName+"'";
				
				Statement stmt = conn.createStatement();
				ResultSet rs= stmt.executeQuery(sqlQuery);
				
				// Retrieves the data from result set object
				if (rs.next()) {
					userBean = new LAUserBean();
					userBean.setUserId(rs.getInt(LADaoConstants.USERID_COLUMN));
					userBean.setUserName(rs.getString(LADaoConstants.USER_NAME_COLUMN));
					userBean.setPassword(rs.getString(LADaoConstants.USER_PASSWORD_COLUMN));
					userBean.setRole(rs.getInt(LADaoConstants.ROLE_COLUMN));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null && !conn.isClosed()) {
					//conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		return userBean;
	}

	
	/**
	 * @param LAUserBean object
	 * @return number (Lets know how many records have been impacted)
	 */
	public int insertUser(LAUserBean bean) {
		
		Connection conn = null;
		int status =  LADaoConstants.Number_0;
		try {

			conn = DBConnection.getConnection();

			if (conn != null) {
				String sqlInsertQuery = LADaoConstants.INSERT_USER_QUERY;
				PreparedStatement pstmt = conn.prepareStatement(sqlInsertQuery);

				//pstmt.setInt(1, userId);
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getUserName());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getPassword());
				pstmt.setInt(LADaoConstants.NUMBER_4, bean.getRole());

				status = pstmt.executeUpdate();

				if (status > LADaoConstants.Number_0) {
					System.out.println("Data Inserted successfully!!");

				} else {
					System.out.println("something went wrong while inserting!!");
				}
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.commit();
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return status;
	}

}
