package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.learnersAcademy.bean.LATeacherBean;
import com.learnersAcademy.util.DBConnection;
/**
 * 
 * @author anildhaubhadel
 *
 */
public class LATeacherDao {

	public List<LATeacherBean> selectAllTeacher() {

		List<LATeacherBean> teachers = null;
		Connection conn = null;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_ALL_TEACHER_QUERY);
				ResultSet rs = stmt.executeQuery();
				teachers = new ArrayList<LATeacherBean>();
				while(rs.next()) {

					int teacherId = Integer.parseInt(rs.getString(LADaoConstants.TEACHER_ID_COLUMN));
					String teacherName = rs.getString(LADaoConstants.TEACHER_NAME_COLUMN);
					String address = rs.getString(LADaoConstants.TEACHER_ADDRESS_COLUMN);
					String dob = rs.getString(LADaoConstants.TEACHER_DOB_COLUMN);
					String phone = rs.getString(LADaoConstants.TEACHER_PHONE_COLUMN);
					String email = rs.getString(LADaoConstants.S_EMAIL_COLUMN);

					teachers.add(new LATeacherBean(teacherId, teacherName, address, dob, email, phone));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return teachers;
	}

	public LATeacherBean selectTeacherById(int id) {
		LATeacherBean bean = null;
		Connection conn = null;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_TEACHER_BY_ID_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {

					int teacherId = Integer.parseInt(rs.getString(LADaoConstants.TEACHER_ID_COLUMN));
					String teacherName = rs.getString(LADaoConstants.TEACHER_NAME_COLUMN);
					String address = rs.getString(LADaoConstants.TEACHER_ADDRESS_COLUMN);
					String dob = rs.getString(LADaoConstants.TEACHER_DOB_COLUMN);
					String phone = rs.getString(LADaoConstants.TEACHER_PHONE_COLUMN);
					String email = rs.getString(LADaoConstants.S_EMAIL_COLUMN);

					bean = new LATeacherBean(teacherId, teacherName, address, dob, email, phone);	
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

	public int insertTeacher(LATeacherBean bean) {
		Connection conn = null;
		int status =  LADaoConstants.Number_0;
		int id=0;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				String[] returnId = { "TEACHER_ID" };
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_TEACHER_QUERY, returnId);

				pstmt.setString(LADaoConstants.NUMBER_1, bean.getTeacherName());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getAddress());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getDOB());
				pstmt.setString(LADaoConstants.NUMBER_4, bean.getPhone());
				pstmt.setString(LADaoConstants.NUMBER_5, bean.getEmail());

				status = pstmt.executeUpdate();

				if (status > LADaoConstants.Number_0) {

					System.out.println("Data Inserted successfully!!");
					try (ResultSet rs = pstmt.getGeneratedKeys()) {
						if (rs.next()) {
							id = rs.getInt(1);
						}
						else {
							throw new SQLException("Creating user failed, no ID obtained.");
						}
					}

				} else {
					System.out.println("something went wrong while inserting!!");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}

	public boolean updateTeacher(LATeacherBean bean) {
		Connection conn = null;
		boolean rowUpdated = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.UPDATE_TEACHER_QUERY);
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getTeacherName());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getAddress());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getDOB());
				pstmt.setString(LADaoConstants.NUMBER_4, bean.getPhone());
				pstmt.setString(LADaoConstants.NUMBER_5, bean.getEmail());
				pstmt.setInt(LADaoConstants.NUMBER_6, bean.getTeacherId());

				rowUpdated = pstmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	public boolean deleteTeacher(int id) {
		Connection conn = null;
		boolean rowDeleted = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				
//				//deleting record in teacher_class DB
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.DELETE_TEACHER_CLASS_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);

				rowDeleted = stmt.executeUpdate() > 0;

				//deleting record in teacher DB
				stmt = conn.prepareStatement(LADaoConstants.DELETE_TEACHER_QUERY);
				
				stmt.setInt(LADaoConstants.NUMBER_1, id);

				rowDeleted = stmt.executeUpdate() > 0;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
}
