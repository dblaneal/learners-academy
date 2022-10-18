package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.learnersAcademy.bean.LATeacherClassBean;
import com.learnersAcademy.util.DBConnection;
/**
 * 
 * @author anildhaubhadel
 *
 */
public class LATeacherClassDao {

	public List<LATeacherClassBean> selectAllTeacherClassByID (int id){
		
		List<LATeacherClassBean> teacherClassList = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.SELCECT_TEACHER_CALSS_BY_ID_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);
				ResultSet rs = stmt.executeQuery();
				teacherClassList = new ArrayList<LATeacherClassBean>();
				while(rs.next()) {
					
					int teacherClassId = Integer.parseInt(rs.getString(LADaoConstants.TEACHER_CLASS_ID_COLUMN));
					String className = rs.getString(LADaoConstants.TEACHER_CLASS_NAME);
					String subjectName = rs.getString(LADaoConstants.TEACHER_CLASS_SUBJECT_NAME);
					teacherClassList.add(new LATeacherClassBean(teacherClassId, className, subjectName));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return teacherClassList;
	}
	
	public int insertTeacherClass(LATeacherClassBean bean) {
		Connection conn = null;
		int status =  LADaoConstants.Number_0;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
			
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_CLASS_QUERY);
				
				pstmt.setString(LADaoConstants.NUMBER_1, bean.getClassName());
				pstmt.setString(LADaoConstants.NUMBER_2, bean.getSubjectName());
				pstmt.setInt(LADaoConstants.NUMBER_3, bean.getTeacherId());
			
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
	
	public boolean insertTeacherClassBatch(List<LATeacherClassBean> bean) {
		Connection conn = null;
		boolean result = false;
		int[] status;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
			
				PreparedStatement pstmt = conn.prepareStatement(LADaoConstants.INSERT_TEACHER_CLASS_QUERY);
				conn.setAutoCommit(false);
				
				for (Iterator<LATeacherClassBean> iterator = bean.iterator(); iterator.hasNext();) {
					
					LATeacherClassBean tcBean = (LATeacherClassBean) iterator.next();
					pstmt.setString(LADaoConstants.NUMBER_1, tcBean.getClassName());
					pstmt.setString(LADaoConstants.NUMBER_2, tcBean.getSubjectName());
					pstmt.setInt(LADaoConstants.NUMBER_3, tcBean.getTeacherId());
					pstmt.addBatch();
				}
				
				status = pstmt.executeBatch();
				conn.commit();
				conn.setAutoCommit(true);

				if (status.length > LADaoConstants.Number_0) {
					System.out.println("Data Inserted successfully!!");
					result = true;

				} else {
					System.out.println("something went wrong while inserting!!");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean deleteTeacherClass(int id) {
		Connection conn = null;
		boolean rowDeleted = false;
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				
				//deleting record in teacher_class DB
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.DELETE_TEACHER_CLASS_QUERY);
				stmt.setInt(LADaoConstants.NUMBER_1, id);

				rowDeleted = stmt.executeUpdate() > 0;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
}
