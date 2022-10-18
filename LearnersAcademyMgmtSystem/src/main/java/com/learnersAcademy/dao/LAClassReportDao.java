package com.learnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.learnersAcademy.bean.LAClassReportBean;
import com.learnersAcademy.util.DBConnection;

/**
 * 
 * @author anildhaubhadel
 *
 */
public class LAClassReportDao {

// Method responsible for getting all ClassReportInfo
/**
 * 
 * @return LAClassReportBean object
 */
	public List<LAClassReportBean> selectAllClassReportInfo(){
		List<LAClassReportBean> classReportList = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getConnection();
			if (conn!= null) {
				PreparedStatement stmt = conn.prepareStatement(LADaoConstants.GET_REPORT_CLASS_QUERY);
				ResultSet rs = stmt.executeQuery();
				classReportList = new ArrayList<LAClassReportBean>();
				
				while(rs.next()) {
					
					String classId = rs.getString(LADaoConstants.CLASS_ID_COLUMN);
					String className = rs.getString(LADaoConstants.CLASS_NAME_COLUMN);
					int studentId = Integer.parseInt(rs.getString(LADaoConstants.S_ID_COLUMN));
					String studentName = rs.getString(LADaoConstants.S_NAME_COLUMN);
					String subject = rs.getString(LADaoConstants.SUBJECT_NAME_COLUMN);
					int teacherId = Integer.parseInt(rs.getString(LADaoConstants.TEACHER_ID_COLUMN));
					String teacherName = rs.getString(LADaoConstants.TEACHER_NAME_COLUMN);
					classReportList.add(new LAClassReportBean(classId, className, studentId, studentName, subject, teacherId,teacherName));
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classReportList;
				
	}
}
