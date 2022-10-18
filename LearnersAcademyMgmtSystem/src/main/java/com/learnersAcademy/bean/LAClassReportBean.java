package com.learnersAcademy.bean;

public class LAClassReportBean implements Comparable<LAClassReportBean>{
	
	private String classId;
	private String className;
	private int studentId;
	private String studentName;
	private String subject;
	private int teacherId;
	private String teacherName;
	
	public LAClassReportBean() {}
	
	
	public LAClassReportBean(String classId, String className, int studentId, String studentName, String subject, int teacherId, String teacherName) {
		
		this.classId = classId;
		this.className = className;
		this.studentId = studentId;
		this.studentName = studentName;
		this.subject = subject;
		this.teacherId = teacherId;
		this.teacherName = teacherName;
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
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void getTeacherName(String teacher) {
		this.teacherName = teacher;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	//sorting list by student name
	@Override
	public int compareTo(LAClassReportBean bean) {
		
		return this.getStudentName().compareTo(bean.getStudentName());
	}
	
}
