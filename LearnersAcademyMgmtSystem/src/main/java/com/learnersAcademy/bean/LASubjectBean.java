package com.learnersAcademy.bean;

/**
 * 
 * @author anildhaubhadel
 * SubjectBean
 */
public class LASubjectBean {
	private String subjectId;
	private String subjectName;
	private String classId;
	private String className;
	
	public LASubjectBean() {}
	
	public LASubjectBean(String subjectId, String subjectName, String classId) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.classId = classId;
	}
	public LASubjectBean(String subjectId, String subjectName, String classId, String className) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.classId = classId;
		this.className = className;
	}
	
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}	
	
}
