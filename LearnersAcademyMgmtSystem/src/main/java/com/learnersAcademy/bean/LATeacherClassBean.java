package com.learnersAcademy.bean;

/**
 * 
 * @author anildhaubhadel
 * TeacherClassBean
 */
public class LATeacherClassBean {

	private int id;
	private int teacherId;
	private String className;
	private String subjectName;
	
	public LATeacherClassBean() {}
	
	public LATeacherClassBean(int teacherId, String className, String subjectName ) {
		this.teacherId = teacherId;
		this.className = className;
		this.subjectName = subjectName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
