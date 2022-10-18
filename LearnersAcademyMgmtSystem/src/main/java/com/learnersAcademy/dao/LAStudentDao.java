package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.learnersAcademy.bean.LAStudentBean;
import com.learnersAcademy.util.DBConnection;

/**
 * 
 * @author anildhaubhadel
 *
 */
public class LAStudentDao {
	
	//Method responsible for getting all student
	/**
	 * 
	 * @return List of LAStudentBean
	 */
	public List<LAStudentBean> selectAllStudent() {
		
		List<LAStudentBean> students = null;
		Connection conn = null;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_ALL_STUDENTS);
				ResultSet rs = stmt.executeQuery();
				students = new ArrayList<LAStudentBean>();
				while(rs.next()) {
					
					int studentId = Integer.parseInt(rs.getString(LADaoConstants.S_ID_COLUMN));
					String studentRollNumber = rs.getString(LADaoConstants.S_ROLL_NUMBER_COLUMN);
					String studentName = rs.getString(LADaoConstants.S_NAME_COLUMN);
					String studentAddress = rs.getString(LADaoConstants.S_ADDRESS_COLUMN);
					String studentDOB = rs.getString(LADaoConstants.S_DOB_COLUMN);
					String studentPhone = rs.getString(LADaoConstants.S_PHONE_COLUMN);
					String studentEmail = rs.getString(LADaoConstants.S_EMAIL_COLUMN);
					String studentEnrollmentDate = rs.getString(LADaoConstants.S_ENROLLMENT_DATE_COLUMN);
					String studentPassoutDate = rs.getString(LADaoConstants.S_PASSOUT_DATE_COLUMN);
					String classId = rs.getString(LADaoConstants.S_CLASS_ID_COLUMN);
					String subjectName =rs.getString(LADaoConstants.S_SUBJECT_NAME_COLUMN);
					String className = rs.getString(LADaoConstants.S_CLASS_NAME_COLUMN);
					
					students.add(new LAStudentBean(
							studentId, 
							studentRollNumber, 
							studentName, 
							studentAddress, 
							studentDOB, 
							studentPhone, 
							studentEmail, 
							studentEnrollmentDate, 
							studentPassoutDate, 
							classId,
							subjectName,
							className));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
	
	//This method returns student by id
	/**
	 * 
	 * @param id
	 * @return LAStudentBean object
	 */
	public LAStudentBean selectStudentById(int id) {
		LAStudentBean bean = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_STUDENT_BY_ID_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();
			
				while(rs.next()) {
					
					int studentId = Integer.parseInt(rs.getString(LADaoConstants.S_ID_COLUMN));
					String studentRollNumber = rs.getString(LADaoConstants.S_ROLL_NUMBER_COLUMN);
					String studentName = rs.getString(LADaoConstants.S_NAME_COLUMN);
					String studentAddress = rs.getString(LADaoConstants.S_ADDRESS_COLUMN);
					String studentDOB = rs.getString(LADaoConstants.S_DOB_COLUMN);
					String studentPhone = rs.getString(LADaoConstants.S_PHONE_COLUMN);
					String studentEmail = rs.getString(LADaoConstants.S_EMAIL_COLUMN);
					String studentEnrollmentDate = rs.getString(LADaoConstants.S_ENROLLMENT_DATE_COLUMN);
					String studentPassoutDate = rs.getString(LADaoConstants.S_PASSOUT_DATE_COLUMN);
					String classId = rs.getString(LADaoConstants.S_CLASS_ID_COLUMN);
					String subjectName =rs.getString(LADaoConstants.S_SUBJECT_NAME_COLUMN);
					String className = rs.getString(LADaoConstants.S_CLASS_NAME_COLUMN);
					
					bean = new LAStudentBean(
							studentId, 
							studentRollNumber, 
							studentName, 
							studentAddress, 
							studentDOB, 
							studentPhone, 
							studentEmail, 
							studentEnrollmentDate, 
							studentPassoutDate, 
							classId,
							subjectName,
							className);
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	//Method help to inert student records in DB
	/**
	 * 
	 * @param bean
	 * @return integer
	 */
	public int insertStudent(LAStudentBean bean) {
		Connection conn = null;
		int status =  LADaoConstants.Number_0;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
			
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_STUDENT_QUERY);
				
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getStudentRollNumber());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getStudentName());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getAddress());
				pstmt.setString(LADaoConstants.NUMBER_4, bean.getDOB());
				pstmt.setString(LADaoConstants.NUMBER_5, bean.getPhone());
				pstmt.setString(LADaoConstants.NUMBER_6, bean.getEmail());
				pstmt.setString(LADaoConstants.NUMBER_7, bean.getClassId());
				pstmt.setString(LADaoConstants.NUMBER_8, bean.getEnrollmentDate());
				pstmt.setString(LADaoConstants.NUMBER_9, bean.getPassoutDate());
				pstmt.setString(LADaoConstants.NUMBER_10, bean.getSubject());
				pstmt.setString(LADaoConstants.NUMBER_11, bean.getClassName());
					
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
	//Update records in DB
	/**
	 * 
	 * @param bean
	 * @return boolean
	 */
	public boolean updateStudent(LAStudentBean bean) {
		Connection conn = null;
		boolean rowUpdated = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.UPDATE_STUDENT_QUERY);
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getStudentRollNumber());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getStudentName());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getAddress());
				pstmt.setString(LADaoConstants.NUMBER_4, bean.getDOB());
				pstmt.setString(LADaoConstants.NUMBER_5, bean.getPhone());
				pstmt.setString(LADaoConstants.NUMBER_6, bean.getEmail());
				pstmt.setString(LADaoConstants.NUMBER_7, bean.getClassId());
				pstmt.setString(LADaoConstants.NUMBER_8, bean.getEnrollmentDate());
				pstmt.setString(LADaoConstants.NUMBER_9, bean.getPassoutDate());
				pstmt.setString(LADaoConstants.NUMBER_10, bean.getSubject());
				pstmt.setString(LADaoConstants.NUMBER_11, bean.getClassName());
				pstmt.setInt(LADaoConstants.NUMBER_12, bean.getStudentId());
					
				rowUpdated = pstmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
	
	public boolean deleteStudent(int id) {
		Connection conn = null;
		boolean rowDeleted = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.DELETE_STUDENT_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);
				
				rowDeleted = stmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
}
