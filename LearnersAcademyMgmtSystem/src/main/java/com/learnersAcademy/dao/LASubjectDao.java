package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.learnersAcademy.bean.LASubjectBean;
import com.learnersAcademy.util.DBConnection;
/**
 * 
 * @author anildhaubhadel
 *
 */
public class LASubjectDao {

	public List<LASubjectBean> selectAllSubject(){
		List<LASubjectBean> subjectList = null;
		Connection conn = null;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_ALL_SUBJECT_QUERY);
				ResultSet rs = stmt.executeQuery();
				subjectList   = new ArrayList<LASubjectBean>();
				while(rs.next()) {

					String subjectId = rs.getString(LADaoConstants.SUBJECT_ID_COLUMN);
					String subjectName = rs.getString(LADaoConstants.SUBJECT_NAME_COLUMN);
					String className = rs.getString(LADaoConstants.SUBJECT_CLASS_ID_COLUMN);
					subjectList.add(new LASubjectBean(subjectId,subjectName, className));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subjectList;

	}
	
	public List<LASubjectBean> selectAllSubjectAndClass(){
		List<LASubjectBean> subjectList = null;
		Connection conn = null;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_ALL_SUBJECT_CLASS_QUERY);
				ResultSet rs = stmt.executeQuery();
				subjectList   = new ArrayList<LASubjectBean>();
				while(rs.next()) {

					String subjectId = rs.getString(LADaoConstants.SUBJECT_ID_COLUMN);
					String subjectName = rs.getString(LADaoConstants.SUBJECT_NAME_COLUMN);
					String classId = rs.getString(LADaoConstants.SUBJECT_CLASS_ID_COLUMN);
					String className = rs.getString(LADaoConstants.CLASS_NAME_COLUMN);
					subjectList.add(new LASubjectBean(subjectId,subjectName,classId, className));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subjectList;

	}

	public List<LASubjectBean> selectSubjectByClassId(String id) {
		List<LASubjectBean> subjectList = null;
		Connection conn = null;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				subjectList = new ArrayList<LASubjectBean>();
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_SUBJECT_BY_CLASS_ID_QUERY);
				stmt.setString(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {

					String subjectId = rs.getString(LADaoConstants.SUBJECT_ID_COLUMN);
					String className = rs.getString(LADaoConstants.SUBJECT_NAME_COLUMN);

					subjectList.add(new LASubjectBean(subjectId, className, id));				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return subjectList;
	}


	public LASubjectBean selectSubjectById(String id) {
		LASubjectBean bean = null;
		Connection conn = null;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELECT_SUBJECT_BY_ID_QUERY);
				stmt.setString(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {

					String subjectId = rs.getString(LADaoConstants.SUBJECT_ID_COLUMN);
					String subjetName = rs.getString(LADaoConstants.SUBJECT_NAME_COLUMN);
					String classId = rs.getString(LADaoConstants.SUBJECT_CLASS_ID_COLUMN);

					bean = new LASubjectBean(subjectId, subjetName, classId);				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public int insertSubject(LASubjectBean bean) {
		Connection conn = null;
		int status =  LADaoConstants.Number_0;

		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {

				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_SUBJECT_QUERY);

				pstmt.setString(LADaoConstants.NUMBER_1, bean.getSubjectId());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getSubjectName());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getClassId());

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

	public boolean updateSubject(LASubjectBean bean) {
		Connection conn = null;
		boolean rowUpdated = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.UPDATE_SUBJECT_QUERY);
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getSubjectName());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getClassId());
				pstmt.setString(LADaoConstants.NUMBER_3, bean.getSubjectId());

				rowUpdated = pstmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	public boolean deleteSubject(String id) {
		Connection conn = null;
		boolean rowDeleted = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.DELETE_SUBJECT_QUERY);
				stmt.setString(LADaoConstants.NUMBER_1, id);;

				rowDeleted = stmt.executeUpdate() > 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
}
